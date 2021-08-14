package entities;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarsDataAccess {
    public List<Vehicle> getCars() {
        String arquivoCSV = "DataBase/carsDB.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {
                String[] data = linha.split(csvDivisor);
                vehicles.add(new Vehicle(data[0], new Tag(data[1]), new Person(data[2])));
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  vehicles;
    }









        //        try {

            //            Scanner scanner = new Scanner(new File("DataBase/carsDB.json"));
//            String content = "";
//            while (scanner.hasNextLine()){
//                content = content.concat(scanner.nextLine() + "\n");
//            }

//            Reader reader = Files.newBufferedReader(Paths.get("DataBase/carsDB.csv"));
//            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
//            List<Vehicle> cars = new ArrayList<>();
//            List<String[]> data = csvReader.readAll();
//            for (String[] vehicle : data) {
//                cars.add(new Vehicle(vehicle[0], new Tag(vehicle[1]), new Person(vehicle[2])));
//            }
//
//            return cars;
//        }catch (Exception e){
//            return new ArrayList<Vehicle>();
//        }

    }
//}
