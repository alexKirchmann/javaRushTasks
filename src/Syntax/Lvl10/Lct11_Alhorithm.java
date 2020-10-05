package Syntax.Lvl10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lct11_Alhorithm {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int [30];

        for (int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(reader.readLine());
        }

        sort(nums);
        System.out.println(nums[9]);
        System.out.println(nums[10]);

    }

    static void sort (int[] arr){
        for (int i = 0; i < arr.length; i++){
        int glass;
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[i] > arr[i+1]){
                    glass = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = glass;
                }
            }
        }
    }
}
