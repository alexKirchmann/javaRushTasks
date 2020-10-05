package Core.Lvl3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lct11_ShowingFileInsides {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());

        while (fileReader.ready()){
            System.out.print((char) fileReader.read());
        }

        reader.close();
        fileReader.close();
    }
}
