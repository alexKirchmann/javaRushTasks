package Core.Lvl4.Lct8_Currency;

public class Dollar extends Money {

    Dollar (double amount) {
        super (amount);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }
}
