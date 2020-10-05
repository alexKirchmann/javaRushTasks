package Syntax.Lvl7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Lct4_FindMaxInArr {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int [20];

        for (int i = 0; i<20; i++){
            arr[i] = (int) (Math.random()*100);
        }

        int max = arr[0];
        for (int i = 1; i<20; i++){
            if (arr[i]>max)
                max = arr[i];
        }

        System.out.println(max);
    }
}
