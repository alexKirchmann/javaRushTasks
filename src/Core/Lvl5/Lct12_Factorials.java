package Core.Lvl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Lct12_Factorials {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n>0 ){

            BigInteger a = BigInteger.valueOf(1);
            BigInteger e = BigInteger.valueOf(1);

            for(int i = 1; i <= n; i++){
                a = e.multiply(a);
            }

            return "" + a.toString();
        }
        else if (n == 0) return "1";
        else return "0";
    }
}