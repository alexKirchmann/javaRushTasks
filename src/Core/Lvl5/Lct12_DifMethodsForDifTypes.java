package Core.Lvl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lct12_DifMethodsForDifTypes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        if (!input.equals("exit")) {
            try {
                if (input.contains(".") && !input.contains("\\D")) {
                    Double d = Double.parseDouble(input);
                    print(d);
                } else {
                    int c = Integer.parseInt(input);

                    if ((c >= 128) || (c <= 0)) print(c);
                    else print((short) c);
                }
            } catch (Exception e) {print(input);}
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
