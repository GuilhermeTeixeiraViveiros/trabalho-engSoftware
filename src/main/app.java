package main;
import entities.Car;
import entities.Person;
import entities.Tag;
import java.io.*;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car newcar = new Car("HCC9999", new Tag("TAG123456"), new Person("Guilherme", "123456"));
        cars.add(newcar);
        cars.add(newcar);
        cars.add(newcar);

        JSONArray JSONARRAY = new JSONArray();
        for (Car car: cars) {
            JSONARRAY.add(car.ToJSONObject());
        }

        FileWriter file = new FileWriter("cars.json");
        file.write(JSONARRAY.toJSONString());
        file.flush();

        String content = "";
        Scanner scanner = new Scanner(new File("cars.json"));
        while (scanner.hasNextLine())
        {
            content = content.concat(scanner.nextLine() + "\n");
        }

        System.out.println(content);
    }
}
