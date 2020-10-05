package Core.Lvl9;

import java.io.*;

public class Lct5_PutingOutNums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fis= new BufferedReader(new FileReader(reader1.readLine()));
        BufferedWriter fos = new BufferedWriter(new FileWriter(reader1.readLine()));
        reader1.close();

        while (fis.ready())
        {
            String  data = fis.readLine();
            String[] dataAll= data.split(" ");
            for(int i = 0; i < dataAll.length;i++) {
                try
                {
                    if(dataAll[i].equals("*\\d"))
                    {
                        dataAll[i]=dataAll[i].replaceAll("\uFEFF","");
                    }
                    System.out.println(dataAll[i]);

                    String number= Integer.parseInt(dataAll[i])+" ";
                    fos.write(number);
                }
                catch (Exception e){}
            }
        }

        fis.close();
        fos.close();
    }
}

