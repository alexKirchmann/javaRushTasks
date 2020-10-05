package Syntax.Lvl9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Lct4_CatchingExceptions {

    public static void main(String[] args) {
        method4();
    }

    public static void method4() {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage() + " has been caught.");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException has been caught. \nException: " + e.getException() + "\nCause: " + e.getCause() + "\nMessage: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Any other errors. Exception has been caught.");
        }
    }

    static void method1() throws FileNotFoundException, ClassNotFoundException
    {
        //тут кинется исключение  FileNotFoundException, такого файла нет
        FileInputStream fis = new FileInputStream("C2:\\badFileName.txt");
    }

}

