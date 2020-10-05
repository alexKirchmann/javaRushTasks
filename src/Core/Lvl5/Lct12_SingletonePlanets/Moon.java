package Core.Lvl5.Lct12_SingletonePlanets;

final class Moon implements Planet {
    private static volatile Moon instance = null;

    private Moon () {}

    public static Moon getInstance() {
        if (instance == null)
            return instance = new Moon();

        return instance;
    }
}
