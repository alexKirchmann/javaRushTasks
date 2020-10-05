package Core.Lvl8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Lct4_FileCopyByBlocks {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:/Фото/Новый текстовый документ.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:/Фото/Новый текстовый документ2.txt");

        byte[] bytes = new byte[1000];
        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(bytes);
            fileOutputStream.write(bytes, 0, count);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
}
