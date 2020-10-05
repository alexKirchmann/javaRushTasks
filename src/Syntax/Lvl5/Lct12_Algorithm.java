package Syntax.Lvl5;

//Введіть з клавіатури кількість чисел, введіть числа, програма виводить найбільше.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lct12_Algorithm {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(reader.readLine());
        if (amount<=0) return;

        int max = Integer.parseInt(reader.readLine());

        for (int i = 0; i < amount-1; i++){
            int n = Integer.parseInt(reader.readLine());
            if (n > max) max = n;
        }

        System.out.println(max);

    }

}
