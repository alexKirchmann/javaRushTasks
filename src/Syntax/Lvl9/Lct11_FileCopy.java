package Syntax.Lvl9;

import java.io.*;
import java.nio.Buffer;

//D:\Фото\Новый текстовый документ.txt

public class Lct11_FileCopy {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;

        System.out.println("ВВЕДІТЬ МІСЦЕЗНАХОДЖЕННЯ ФАЙЛА: ");
        try {
            fileInputStream = new FileInputStream(reader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + "\nВВЕДІТЬ МІСЦЕЗНАХОДЖЕННЯ ФАЙЛА ЩЕ РАЗ: ");
            try {
                fileInputStream = new FileInputStream(reader.readLine());
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        } catch (IOException io){
            System.out.println(io.getMessage());
        }


        System.out.println("ВВЕДІТЬ МІСЦЕЗНАХОДЖЕННЯ ДЛЯ КОПІЇ ФАЙЛА: ");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

            while (fileInputStream.available() > 0){
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
