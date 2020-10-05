package Syntax.Lvl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lct4_ReverseStringArr {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] Sarr = new String[10];

        for (int i = 0; i < 10; i++) {
            Sarr[i] = reader.readLine();
        }

        String glass;
        for (int i = 0; i < Sarr.length / 2; i++) {
            glass = Sarr[i];
            Sarr[i] = Sarr[Sarr.length - 1 - i];
            Sarr[Sarr.length - 1 - i] = glass;
        }

        for (int i = 0; i < Sarr.length; i++) {
            System.out.println(Sarr[i]);
        }
    }
}
