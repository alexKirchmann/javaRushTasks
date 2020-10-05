package Core.Lvl3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Lct11_WriteStringsToFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(reader.readLine());

        while (true){
            String s = reader.readLine();
            if (s.equals("exit")) break;

            fileWriter.write(s + "\n");
        }

        reader.close();
        fileWriter.close();
    }
}
