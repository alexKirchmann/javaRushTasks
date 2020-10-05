package Core.Lvl8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Lct3_TheMostOftenBytes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();


        HashMap<Integer, Integer> map = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            if (map.containsKey(b)) map.replace(b, map.get(b) + 1);
            else map.put(b, 1);
        }
        fileInputStream.close();


        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (max == null) {max = pair;}
            if (pair.getValue() > max.getValue()) max = pair;
        }


        System.out.println(max.getKey() + " --- " + max.getValue());
    }

}
