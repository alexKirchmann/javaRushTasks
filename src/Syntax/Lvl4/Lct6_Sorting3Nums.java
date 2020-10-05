package Syntax.Lvl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Lct6_Sorting3Nums {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if (s.equals("")) break;
            Integer x = Integer.parseInt(s);
            nums.add(x);
        }
        printSortInt(nums);
    }

    static void printSortInt (ArrayList<Integer> nums){

        for (int i = 0; i < nums.size(); i++) {
            for (int j = nums.size()-1; j >= i+1; j--) {
                int glass;

                if (nums.get(j) > nums.get(j-1)) {
                    glass = nums.get(j-1);
                    nums.set(j-1, nums.get(j));
                    nums.set(j, glass);

                }
            }

            System.out.print(nums.get(i) + " ");
        }
    }

}
