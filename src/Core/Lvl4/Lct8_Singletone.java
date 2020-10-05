package Core.Lvl4;

final class Lct8_Singletone {
    private static Lct8_Singletone instance = new Lct8_Singletone();

    static Lct8_Singletone getInstance (){
        return instance;
    }

    private Lct8_Singletone () {
    }
}
