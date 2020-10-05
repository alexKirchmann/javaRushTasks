package Core.Lvl7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Lct10_Transactionism {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();

            BufferedReader fileReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
            BufferedReader fileReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));

            while (fileReader1.ready()){allLines.add(fileReader1.readLine());}
            while (fileReader2.ready()){forRemoveLines.add(fileReader2.readLine());}
        }
        catch (IOException io) {
            io.getMessage();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException ();
        }
    }

    static class CorruptedDataException extends IOException {
    }
}
