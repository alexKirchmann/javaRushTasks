package Core.Lvl8;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Lct11_CRUD3_Price {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader = new BufferedReader(new FileReader(filename));
        int idData = 0;

        while (reader.ready()) {
            String data = reader.readLine();
            String  id  = data.substring(0,8);
            id = id.replace(" ","");
            int a= Integer.parseInt(id);
            if (idData<a) idData=a;
        }
        idData++;

        reader.close();

        if (args.length != 0 && args[0].equals("-c")) {
            String id = "" + idData;
            for (int i=id.length();i<8;i++) {
                id = id + " ";
            }

            String  name = args[1];
            for (int i = name.length(); i<30; i++) {
                name = name + " ";
            }

            String price = args[2];
            for (int i = price.length(); i < 8; i++)
            {
                price = price + " ";
            }

            String quantity= args[3];
            for (int i = quantity.length(); i < 4; i++) {
                quantity = quantity + " ";
            }

            String newline="\r\n";
            String data =id+name+price+quantity;

            FileOutputStream fis = new FileOutputStream (filename, true);
            fis.write(newline.getBytes());
            fis.write(data.getBytes());
            fis.close();
        }
    }
}

