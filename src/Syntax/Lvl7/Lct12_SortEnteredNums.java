package Syntax.Lvl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Lct12_SortEnteredNums {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (true){
        String s = reader.readLine();

        if (s.equals("")) break;
        else arrayList.add(Integer.parseInt(s));
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size()-i-1; j++){
                Integer glass = null;
                if (arrayList.get(j) < arrayList.get(j+1)) {
                    glass = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, glass);
                }

            }
        }

        for (Integer i : arrayList) {
            System.out.println(i);
        }

    }

}

