package Core.Lvl3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Lct11_SortingNumsFromFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner (new FileInputStream(reader.readLine()));

        reader.close();
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (scanner.hasNextInt()){
            arrayList.add(scanner.nextInt());
        }


        for (int i = 0; i < arrayList.size(); i++) {
            int glass;
            for (int j = 0; j < arrayList.size()-1-i; j++){
                if (arrayList.get(j) > arrayList.get(j+1)){
                    glass = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j, glass);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0)
                System.out.println(arrayList.get(i));
        }
    }
}