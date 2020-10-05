package Core.Lvl8;

import Core.Lvl6.Lct13_FilesOut;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lct11_ThreadsAndBytes {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;

            new ReadThread (fileName).start();
        }

        reader.close();
    }



    static class ReadThread extends Thread {
        private String name;

        public ReadThread (String fileName) {
            this.name = fileName;
        }

        public void run() {
            TreeMap<Integer, Integer> countBytes = new TreeMap<>();

            try {
                BufferedInputStream bIS = new BufferedInputStream(new FileInputStream(name));

                while (bIS.available()>0) {
                    int b = bIS.read();
                    if (!countBytes.containsKey(b)) {
                        countBytes.put(b, 1);
                    }
                    else {
                        countBytes.replace(b, b+1);
                    }

                    bIS.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            int bKey = 0;
            int max = 0;

            for (Map.Entry<Integer, Integer> pair : countBytes.entrySet()){
                if (pair.getValue() > max) {
                    max = pair.getValue();
                    bKey = pair.getKey();
                }
            }

            resultMap.put(name, bKey);

        }

    }
}
