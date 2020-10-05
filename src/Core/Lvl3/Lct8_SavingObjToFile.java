package Core.Lvl3;

import java.io.FileOutputStream;
import java.io.OutputStream;

class Lct8_SavingObjToFile {

    public static void main(String[] args)
    {
        MyClass myObject = new MyClass();
        OutputStream outStream = new FileOutputStream("c:/my-object-data.txt");

        while (myObject.available() > 0)
        {
            int data = myObject.read();
            outStream.write(data);
        }

        outStream.close();
    }
}
