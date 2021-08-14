package entities;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ChargeBusinessRules {

    public static void chargeByPlate(String plate){
        ArrayList<Vehicle> vehicles = getVehicle();
        //procurar a placa nos vehicles

    }

    public static void chargeByTAG(String TAG){
        return;
    }

    public static void chargeByImage(String path){
        return;
    }

    private static ArrayList<Vehicle> getVehicle() {
        CarsDataAccess carsDataAccess = new CarsDataAccess();
        return carsDataAccess.getCars();

    }
}
