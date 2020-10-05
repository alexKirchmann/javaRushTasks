package Core.Lvl4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lct8_ListOfExceptions {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            File file = new File("lines.txt");
            Scanner scan = new Scanner(file);

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {String ptr = null;
            if (ptr.equals("gfg"))
                System.out.print("Same");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { int[] cats = new int[10];
            int a= cats[11];

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new IllegalMonitorStateException();
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new IllegalAccessException();
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new IllegalStateException();
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new InterruptedException();
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            throw new RuntimeException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
