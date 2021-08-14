package main;
import com.google.gson.Gson;
import entities.ChargeBusinessRules;
import entities.Vehicle;
import entities.Person;
import entities.Tag;
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws IOException {
        Scanner menu = new Scanner (System.in);

        System.out.print("##-- Toll --##\n\n");
        System.out.print("|----------------------------|\n");
        System.out.print("| Option 1 - Charge by PLATE |\n");
        System.out.print("| Option 2 - Charge by TAG   |\n");
        System.out.print("| Option 3 - Charge by IMAGE |\n");
        System.out.print("| Option 4 - Exit            |\n");
        System.out.print("|----------------------------|\n");
        System.out.print("Insert an Option : ");

        switch (menu.nextInt()) {
            case 1:
                System.out.print("\nCharge by plate");
                System.out.print("\nInsert plate");
                String plate = menu.next();
                ChargeBusinessRules.chargeByPlate(plate);
                break;

            case 2:
                System.out.print("\nCharge by tag");
                System.out.print("\nInsert tag");
                String tag = menu.next();
                ChargeBusinessRules.chargeByTAG(tag);
                break;

            case 3:
                System.out.print("\nCharge by image\n");
                System.out.print("\nInsert image path");
                String path = menu.next();
                ChargeBusinessRules.chargeByImage(path);
                break;

            default:
                System.out.print("\nInvalid option!");
                break;

            case 4:
                System.out.print("\nBye!");
                menu.close();
        }
    }
}
