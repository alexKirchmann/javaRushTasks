package Core.Lvl10;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lct7_TransientSerialization implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oIS = new ObjectInputStream(new FileInputStream("D:/Фото/Новый текстовый документ.txt"));
        ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream("D:/Фото/Новый текстовый документ.txt"));

        Lct7_TransientSerialization example1 = new Lct7_TransientSerialization(36);
        oOS.writeObject(example1);

        Lct7_TransientSerialization example2 = new Lct7_TransientSerialization(22);
        example2 = (Lct7_TransientSerialization) oIS.readObject();

        boolean b = example1.string.equals(example2.string);
        System.out.println(b);
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    transient private int temperature;
    String string;

    public Lct7_TransientSerialization (int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
