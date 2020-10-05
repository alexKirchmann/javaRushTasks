package Core.Lvl4.Lct6_HenFactory;

class UkrainianHen extends Hen implements Country {

    int getCountOfEggsPerMonth () {
        return 4;
    }

    @Override
    String getDescription () {
        return super.getDescription() + " I'm from " + Country.UKR + ". And I produce " + getCountOfEggsPerMonth() + " eggs per month!";
    }
}
