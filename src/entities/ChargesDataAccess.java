package entities;

import java.io.*;

public class ChargesDataAccess {

    public void AddCharge(Charge charge){
        try {
            FileWriter wr = new FileWriter("DataBase/chargesDB.csv",true);
            BufferedWriter br = new BufferedWriter(wr);
            PrintWriter out = new PrintWriter(br);
            out.println(charge.getPlate() + "," + charge.getDate() + "," + charge.getStatus() + "," + charge.getPrice());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
