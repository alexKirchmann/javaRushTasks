package Core.Lvl5.Lct12_SingletonePlanets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Process {
    public static Planet thePlanet;

    static
    {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {
    }



    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String a = reader.readLine();
            if (a == null)
                thePlanet = null;
            else if (Planet.MOON.equals(a))
                thePlanet = Moon.getInstance();
            else if (Planet.SUN.equals(a))
                thePlanet = Sun.getInstance();
            else if (Planet.EARTH.equals(a))
                thePlanet = Earth.getInstance();
            else
                thePlanet = null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
