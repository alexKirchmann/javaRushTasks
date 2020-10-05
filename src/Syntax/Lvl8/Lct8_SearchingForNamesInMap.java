package Syntax.Lvl8;

import java.util.HashMap;
import java.util.Map;

class Lct8_SearchingForNamesInMap {

    public static void main(String[] args) {

        showAllPeopleWithName(createMap(), "Alex");
    }





    static HashMap<String, String> createMap () {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ponomarenko", "Alex");
        map.put("Kirchmann", "Alex");
        map.put("Romanenko", "Dmytro");
        map.put("Stecenko", "Valentina");
        map.put("Kovalenko", "Anton");
        return map;
    }

    public static void showAllPeopleWithName (Map<String, String> map, String name){
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
