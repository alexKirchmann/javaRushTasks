package Core.Lvl9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Lct11_ReverseStringWithStringBuffer {
    public static void main(String[] args) throws  Exception {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        FileReader fis = new FileReader(reader1.readLine());
        reader1.close();
        BufferedReader reader=new BufferedReader(fis);

        while (reader.ready())
        {
            String data = reader.readLine();
            data = new StringBuffer(data).reverse().toString();
            System.out.println(data);
        }

        reader.close();
        fis.close();

    }
}
