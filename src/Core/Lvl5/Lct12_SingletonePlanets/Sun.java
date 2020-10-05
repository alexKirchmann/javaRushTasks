package Core.Lvl5.Lct12_SingletonePlanets;

final class Sun implements Planet {

    private static volatile Sun instance = null;

    private Sun () {}

    public static Sun getInstance() {
        if (instance == null)
            instance = new Sun();

        return instance;
    }

}
