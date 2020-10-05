package Core.Lvl5.Lct12_SingletonePlanets;

final class Earth implements Planet {
    private static volatile Earth instance = null;

    private Earth() {}

    public static Earth getInstance() {
        if (instance == null)
            instance = new Earth();

        return instance;
    }
}
