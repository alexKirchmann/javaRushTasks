package Core.Lvl4.Lct8_Currency;

abstract class Money {
    private double amount;

    public double getAmount() {
        return amount;
    }

    Money (double amount){
        this.amount = amount;
    }

    abstract String getCurrencyName();
}
