package Syntax.Lvl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Lct12_AllFirstLettersToUpperCase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        char[] charz = s.toCharArray();

        charz[0] = Character.toUpperCase(charz[0]);
        for (int i = 1; i < charz.length; i++) {
            //Character.toUpperCase()
            if (charz[i-1] == ' ') charz[i] = Character.toUpperCase(charz[i]);
        }

        System.out.println(String.valueOf(charz));
    }

}
