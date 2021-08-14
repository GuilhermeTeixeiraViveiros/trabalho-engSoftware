package entities;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChargeBusinessRules {

    public static int chargeByPlate(String plate){
        List<Vehicle> vehicles = getVehicle();

        for (Vehicle v: vehicles ) {
            if(v.getPlate().equals(plate) ){
                AddChargeToVehicle(v);
                return 0;
            }
        }

        return -1;
    }

    public static int chargeByTAG(String TAG){
        ArrayList<Vehicle> vehiclesWithTags = getVehicleWithTags();

        for (Vehicle v: vehiclesWithTags ) {
            if(v.getAssociatedTag().getId().equals(TAG)){
                AddChargeToVehicle(v);
                return 0;
            }
        }
        return -1;
    }

    public static void chargeByImage(String path){
        return;
    }

    private static ArrayList<Vehicle> getVehicleWithTags() {
        ArrayList<Vehicle> vehiclesWithTags = new ArrayList<>();
        getVehicle().forEach((v) -> {
            if(v.getAssociatedTag() != null){
                vehiclesWithTags.add(v);
            }
        });
        return vehiclesWithTags;
    }

    private static List<Vehicle> getVehicle() {
        CarsDataAccess carsDataAccess = new CarsDataAccess();
        return carsDataAccess.getCars();
    }

    private static void AddChargeToVehicle(Vehicle vehicle){
        ChargesDataAccess chargesDataAccess = new ChargesDataAccess();
        chargesDataAccess.AddCharge(new Charge(vehicle.getPlate(), Date.from(Instant.now()), Status.NOT_PAID, 10.0));
    }
}
