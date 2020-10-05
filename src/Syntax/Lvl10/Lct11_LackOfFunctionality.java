package Syntax.Lvl10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Lct11_LackOfFunctionality {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {

            String name = reader.readLine();
            String test = reader.readLine();

            if (name.equals("") || test.equals("")) break;

            int id = Integer.parseInt(test);
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("Id=" + pair.getKey() + " Name=" + pair.getValue());
        }
    }

}


