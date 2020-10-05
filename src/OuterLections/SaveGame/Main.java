package OuterLections.SaveGame;

import java.io.*;

class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String[] tInfo = {"Theocratic Empire has 7 lands", "Automatized Republic has 3 lands", "Intertwined Kingdom has 5 lands"};
        String[] rInfo = {"Theocratic Empire has 100K credits", "Automatized Republic has 300K credits", "Intertwined Kingdom has 200K credits"};
        String[] dInfo = {"Theocratic Empire is in conflict with Automatized Republic", "Intertwined Kingdom in neutral"};

        TerritoriesInfo territoriesInfo = new TerritoriesInfo(tInfo);
        ResourcesInfo resourcesInfo = new ResourcesInfo(rInfo);
        DiplomacyInfo diplomacyInfo = new DiplomacyInfo(dInfo);

        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);
        System.out.println(savedGame.toString());

        saveGame(savedGame);

        String[] tI = {""};
        savedGame = new SavedGame(new TerritoriesInfo(tI), new ResourcesInfo(tI), new DiplomacyInfo(tI));

        System.out.println(savedGame.toString());

        savedGame = loadGame();
        System.out.println(savedGame.toString());

    }

    public static void saveGame(SavedGame savedGame) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Фото\\SavedGame.txt"));

        objectOutputStream.writeObject(savedGame);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static SavedGame loadGame () throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Фото\\SavedGame.txt"));
        return (SavedGame) objectInputStream.readObject();
    }
}
