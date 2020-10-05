package Core.Lvl8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Lct8_Wrapper_AmigoOutputStream extends FileOutputStream {
    private FileOutputStream original;
    private static String fileName = "D:/Фото/Новый текстовый документ.txt";

    Lct8_Wrapper_AmigoOutputStream (FileOutputStream fos) throws FileNotFoundException {
        super(fileName);
        this.original = fos;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Lct8_Wrapper_AmigoOutputStream(new FileOutputStream(fileName));
    }

    @Override
    public void flush() throws IOException
    {
        original.flush();
    }

    public void write(int b) throws IOException
    {
        original.write(b);
    }

    public void write(byte[] b) throws IOException
    {
        original.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException
    {
        original.write(b,off,len);
    }

    public  void close() throws IOException {
        flush();
        String data = "Veles Corp. © All rights reserved.";
        original.write(data.getBytes());
        original.close();
    }
}
