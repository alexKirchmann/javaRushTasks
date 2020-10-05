package Syntax.Lvl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lct4_DaysInYear {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("кількість днів у році: " + getDNum(Integer.parseInt(reader.readLine())));
    }

    static int getDNum (int year) {
        if (year%400 == 0 && year%100 == 0)
            return 366;
        if (year%4 == 0)
            return 366;
        else return 365;
    }

}
