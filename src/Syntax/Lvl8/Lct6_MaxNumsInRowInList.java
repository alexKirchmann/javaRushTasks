package Syntax.Lvl8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Lct6_MaxNumsInRowInList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            list.add(Integer.parseInt( reader.readLine()));
        }
        int count1=1;
        int counttotal=1;
        for (int i=0;i<9;++i){
            if (list.get(i).equals(list.get(i + 1))) {
                count1++;
                if (count1 > counttotal) {
                    counttotal = count1;
                }
            } else count1 = 1;
        }
        System.out.println(counttotal);
    }
}
