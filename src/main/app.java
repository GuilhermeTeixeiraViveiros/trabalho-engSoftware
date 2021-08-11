package main;
import entities.Car;
import entities.Person;
import entities.Tag;

import java.io.*;
import java.io.FileWriter;

public class app {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("employees.json");
        Car car = new Car("HCC9999", new Tag("TAG123456"), new Person("Guilherme", "123456"));

        file.write("Oláaa");
        file.flush();
    }
}
