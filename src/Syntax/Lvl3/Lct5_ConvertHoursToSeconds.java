package Syntax.Lvl3;

class Lct5_ConvertHoursToSeconds {

    public static void main(String[] args) {
        System.out.println(convertToSec(1));
    }

    static int convertToSec (int hours) {
        return hours*60*60;
    }
}
