package Core.Lvl8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lct11_LookingForDataInFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        Scanner lineScanner;

        while (scanner.hasNext()){
            String s = scanner.nextLine();
            lineScanner = new Scanner(s);

            if (lineScanner.nextInt() == Integer.parseInt(args[0])){
                System.out.println(s);
            }
        }
    }
}


    /*

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String file =reader.readLine();
        reader = new BufferedReader(new FileReader(file));

        while (reader.ready()) {
            String s = reader.readLine();
            String[] subStr;
            String delimeter = " ";
            subStr = s.split(delimeter);
            if(subStr[0].equals(args[0])) {
                System.out.println(s);
                break;
            }
        }
        reader.close();
    }

    */
