package Core.Lvl8;

import java.io.*;
import java.util.ArrayList;

public class Lct11_RoundingUpFromFileToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1= new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        ArrayList<Integer> number = new ArrayList<>();

        byte[] data = new byte[file1.available()];
        for (int i=0;i<data.length;i++)
        {
            data[i]=(byte) file1.read();
        }

        String num = "";
        for (int a=0;a<data.length;a++)
        {
            if (data[a]!=32 || a==data.length-1)
            {
                num = num + (char) data[a];
            }
            if(a==data.length-1 || data[a]==32)
            {
                number.add(Lct11_RoundingUpFromFileToFile.roundUp(num));
                num = "";
            }
        }

        for (Integer a : number)
        {
            String numerS = "" + a;
            char[] symbol = numerS.toCharArray();
            for(int i = 0; i < symbol.length; i++)
            {
                file2.write((byte) (symbol[i]));
            }

            file2.write(32);
        }

        reader.close();
        file1.close();
        file2.close();

        for (int a = 0; a < number.size(); a++)
        {
            file2.write(32);
        }

    }

    public static int roundUp (String a)
    {
        double number = Double.parseDouble(a);
        if (number >= 0.0)
        {
            if ((number % 1.0) >= 0.5)
            {
                return (int) ((number/1)+1);
            }
            else return (int) (number/1);
        }
        else
        {
            if ((number % 1.0) >= (-0.5))
            {
                return (int) (number/1);
            }
            else {
                return (int) (number / 1) - 1;
            }
        }
    }
}

