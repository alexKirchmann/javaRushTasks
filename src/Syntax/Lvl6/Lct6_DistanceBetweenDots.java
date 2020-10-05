package Syntax.Lvl6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lct6_DistanceBetweenDots {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER X1");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.println("ENTER Y1");
        int y1 = Integer.parseInt(reader.readLine());
        System.out.println("ENTER X2");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.println("ENTER Y2");
        int y2 = Integer.parseInt(reader.readLine());

        System.out.println("DISTANCE BETWEEN DOTS 1 AND 2 IS: " + getDistance(x1,y1,x2,y2));

    }

    static double getDistance (int x1, int y1, int x2, int y2){
        return Math.sqrt((double) (x2-x1)*(x2-x1) + (double) (y2-y1)*(y2-y1));
    }

}
