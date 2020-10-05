package Core.Lvl4.Lct6_HenFactory;

class Process {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen (Country.UKR);
        System.out.println(hen.getCountOfEggsPerMonth());
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen (String country) {
            switch (country){
                case ("Ukraine") :
                    return new UkrainianHen();
                case ("America") :
                    return new AmericanHen();
                case ("Moldova") :
                    return new MoldovanHen();
                case ("Israel") :
                    return new IsraelHen();
            }
            return null;
        }
    }

}
