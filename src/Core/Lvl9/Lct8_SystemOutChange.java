package Core.Lvl9;

import Core.Lvl9.Lct3_AnotherAdapter.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Lct8_SystemOutChange {
    static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOut = System.out;
        ByteArrayOutputStream bAOS = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(bAOS);
        System.setOut(stream);

        testString.printSomething();

        System.setOut(consoleOut);

        System.out.println(bAOS.toString().toUpperCase());
    }



    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
