package Syntax.Lvl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Lct11_Sort5Nums {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int [5];

        for (int i = 0; i<5; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i<5; i++){
            System.out.println(arr[i]);
        }

    }
}
