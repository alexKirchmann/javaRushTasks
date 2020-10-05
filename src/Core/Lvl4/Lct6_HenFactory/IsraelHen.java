package Core.Lvl4.Lct6_HenFactory;

class IsraelHen extends Hen implements Country {

    int getCountOfEggsPerMonth () {
        return 4;
    }

    @Override
    String getDescription () {
        return super.getDescription() + "I'm from " + Country.ISR + ". And I produce " + getCountOfEggsPerMonth() + " eggs per month!";
    }
}

