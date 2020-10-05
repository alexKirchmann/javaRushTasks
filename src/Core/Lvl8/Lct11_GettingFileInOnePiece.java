package Core.Lvl8;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Lct11_GettingFileInOnePiece {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNames = reader.readLine();
        Map<Integer,String> fileData = new TreeMap<>();

        while (!fileNames.equals("end"))
        {
            String[] subStr;
            String delimeter = ".part";
            subStr = fileNames.split(delimeter);

            int key = Integer.parseInt(subStr[subStr.length-1]);

            fileData.put(key,fileNames);
            fileNames=reader.readLine();
        }

        fileNames = fileData.get(1);
        String[] subStr;
        String delimeter = ".part";
        subStr = fileNames.split(delimeter);
        fileNames = subStr[0];

        FileOutputStream fos = new FileOutputStream(fileNames);

        for (int i=1; i<=fileData.size();i++){
            FileInputStream fis = new FileInputStream (fileData.get(i));
            byte [] data = new byte[fis.available()];

            while (fis.available() > 0) {
                int count = fis.read(data);
                fos.write(data, 0, count);
            }

            fis.close();
        }

        fos.close();
        reader.close();
    }

}
