package Core.Lvl3;

import java.io.FileInputStream;
import java.io.InputStream;

class Lct8_ReadingObjFromFile {

    public static void main(String[] args)
    {
        InputStream inStream = new FileInputStream("c:/my-object-data.txt");
        MyClass myObject = new MyClass();

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один int из потока для чтения
            myObject.write(data); //записываем прочитанный int в другой поток.
        }

        inStream.close(); //закрываем потоки
    }
}
