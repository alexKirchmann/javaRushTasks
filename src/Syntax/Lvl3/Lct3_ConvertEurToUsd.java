package Syntax.Lvl3;

class Lct3_ConvertEurToUsd {

    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15, 0.5));
    }

    static double convertEurToUsd (int eur, double exchangeRate) {
        return eur * exchangeRate;
    }

}
