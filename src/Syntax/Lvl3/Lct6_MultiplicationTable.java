package Syntax.Lvl3;

import java.util.ArrayList;

class Lct6_MultiplicationTable {
    public static void main(String[] args) {
        for (int LNum = 1; LNum < 11; LNum++){
            for (int i = 0; i < 10; i++){
                System.out.print(getLine(LNum).get(i));
            }
            System.out.println();
        }
    }

    static ArrayList getLine (int LNum){
        ArrayList<String> line = new ArrayList<>();
        for (int i = 1; i < 11; i++){
            line.add(i*LNum + " ");
        }
        return line;
    }
}
