package main;
import entities.ChargeBusinessRules;
import java.io.*;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws IOException {
        Scanner menu = new Scanner (System.in);
        while (true){

            printMenu();

            switch (menu.nextInt()) {
                case 1:
                    chargeByPlate(menu);
                    break;

                case 2:
                    chargeByTag(menu);
                    break;

                case 3:
                    chargeByImage(menu);
                    break;

                default:
                    System.out.print("\nInvalid option!");
                    break;

                case 4:
                    System.out.print("\nBye!");
                    menu.close();
                    System.exit(0);
            }
        }
    }

    private static void printMenu() {
        System.out.print("\n##-- Toll --##\n\n");
        System.out.print("|----------------------------|\n");
        System.out.print("| Option 1 - Charge by PLATE |\n");
        System.out.print("| Option 2 - Charge by TAG   |\n");
        System.out.print("| Option 3 - Charge by IMAGE |\n");
        System.out.print("| Option 4 - Exit            |\n");
        System.out.print("|----------------------------|\n");
        System.out.print("Insert an Option : ");
    }

    private static void chargeByImage(Scanner menu) {
        System.out.print("\nCharge by image\n");
        System.out.print("\nInsert image path: ");
        String path = menu.next();
        ChargeBusinessRules.chargeByImage(path);
        return;
    }

    private static void chargeByTag(Scanner menu) {
        System.out.print("\nCharge by tag");
        System.out.print("\nInsert tag: ");
        String tag = menu.next();
        if(ChargeBusinessRules.chargeByTAG(tag) == -1) {
            System.out.print("\nUnable to complete charge.");
            return;
        }
        System.out.print("\nVehicle charged successfully!");
        return;
    }

    private static void chargeByPlate(Scanner menu) {
        System.out.print("\nCharge by plate");
        System.out.print("\nInsert plate: ");
        String plate = menu.next();
        if(ChargeBusinessRules.chargeByPlate(plate) == -1){
            System.out.print("\nUnable to complete charge.");
            return;
        }
        System.out.print("\nVehicle charged successfully!");
        return;
    }
}
