package Core.Lvl4.Lct6_HenFactory;

class MoldovanHen extends Hen {

    int getCountOfEggsPerMonth () {
        return 8;
    }

    @Override
    String getDescription () {
        return super.getDescription() + "I'm from " + Country.MLD + ". And I produce " + getCountOfEggsPerMonth() + " eggs per month!";
    }
}

