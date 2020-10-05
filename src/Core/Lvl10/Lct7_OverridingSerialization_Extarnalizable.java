package Core.Lvl10;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lct7_OverridingSerialization_Extarnalizable implements Runnable {
    transient private Thread runner;
    private int speed;

    public Lct7_OverridingSerialization_Extarnalizable(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        System.out.println("LOADING CONSCIENCE");
    }

    /**
     * Переопределяем сериализацию.
     * Для этого необходимо объявить методы:
     * private void writeObject(ObjectOutputStream out) throws IOException
     * private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     * Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        new Thread(this).start();
        in.defaultReadObject();

    }

    public static void main(String[] args) {

    }
}
