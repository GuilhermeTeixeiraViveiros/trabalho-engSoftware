package entities;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarsDataAccess {

    public ArrayList<Vehicle> getCars() {
        try {
            Scanner scanner = new Scanner(new File("DataBase/carsDB.json"));
            String content = "";
            while (scanner.hasNextLine()){
                content = content.concat(scanner.nextLine() + "\n");
            }
            Gson gson = new Gson();
            ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
            cars = gson.fromJson(content, cars.getClass());
            return cars;
        }catch (Exception e){
            return new ArrayList<Vehicle>();
        }

    }
}
