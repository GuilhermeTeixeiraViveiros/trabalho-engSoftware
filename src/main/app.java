package main;
import entities.Car;
import entities.Person;
import entities.Tag;
import java.io.*;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> cars = new ArrayList<Car>();
        Car newcar = new Car("HCC9999", new Tag("TAG123456"), new Person("Guilherme", "123456"));
        cars.add(newcar);

        JSONObject jsonOBJ = new JSONObject();

        jsonOBJ.put("AssociatedTag", newcar.getAssociatedTag().getId());
        jsonOBJ.put("Plate", newcar.getPlate());
        jsonOBJ.put("Owner", newcar.getOwner().getId());

        JSONArray JSONARRAY = new JSONArray();

        JSONARRAY.add(jsonOBJ);
        JSONARRAY.add(jsonOBJ);
        JSONARRAY.add(jsonOBJ);

        FileWriter file = new FileWriter("cars.json");
        file.write(JSONARRAY.toJSONString());
        file.flush();
    }
}
