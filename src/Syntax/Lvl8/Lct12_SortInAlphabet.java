package Syntax.Lvl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Lct12_SortInAlphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] words = new String [20];

        for (int i = 0; i < words.length; i++){
            words[i] = reader.readLine();
        }

        sort(words);

        for (String word: words) {
            System.out.println(word);
        }

    }

    static void sort (String [] arr) {
        for (int j = 0; j<arr.length; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                String s;
                if (greaterInUnicode(arr[i], arr[i + 1])) {
                    s = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = s;
                }
            }
        }
    }

    static boolean greaterInUnicode (String a, String b) {
        return a.compareToIgnoreCase(b) > 0;
    }

}
