package Core.Lvl4.Lct8_Currency;

public class Euro extends Money {
    Euro (double amount){
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "EUR";
    }
}
