package main;
import com.google.gson.Gson;
import entities.Car;
import entities.Person;
import entities.Tag;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws IOException {
        ArrayList cars = new ArrayList<Car>();
        Car newcar = new Car("HCC9999", new Tag("TAG123456"), new Person("Guilherme", "123456"));
        cars.add(newcar);
        cars.add(newcar);
        cars.add(newcar);

        Gson gson = new Gson();
        String json = gson.toJson(cars);

        FileWriter file = new FileWriter("DataBase/carsDB.json");
        file.write(json);
        file.flush();

        String content = "";
        Scanner scanner = new Scanner(new File("DataBase/carsDB.json"));
        while (scanner.hasNextLine())
        {
            content = content.concat(scanner.nextLine() + "\n");
        }

        ArrayList<Car> carros = gson.fromJson(content, cars.getClass());

    }
}
