package Core.Lvl8;

import java.io.*;

class Lct5_SplitFileInTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        int count = inputStream.available();

        if(count % 2 == 0) {
            for (int i = 0; i < count / 2; ++i)
                outputStream1.write(inputStream.read());
        }
        else {
            for(int i = 0; i < count / 2 + 1; ++i)
                outputStream1.write(inputStream.read());
        }

        while(inputStream.available() > 0)
            outputStream2.write(inputStream.read());

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
