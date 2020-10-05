package Syntax.Lvl2;

class Lct2_ConvertCelsiusToFahrenheit {

    public static void main(String[] args) {
        System.out.println(convertCelToFahr(35));

    }

    static double convertCelToFahr (int TC) {
        return ((double) 9 / 5) * (double) TC + 32.0;
    }
    
}
