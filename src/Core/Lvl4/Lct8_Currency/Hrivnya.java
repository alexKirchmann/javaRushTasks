package Core.Lvl4.Lct8_Currency;

public class Hrivnya extends Money {
    Hrivnya (double amount){
        super (amount);
    }

    @Override
    String getCurrencyName() {
        return "UAH";
    }
}
