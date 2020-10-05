package Core.Lvl4;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lct8_MaxCommonFactor {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;

        try {
            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
        }
        catch (IOException | NumberFormatException ioE) {
            System.out.println(ioE.getClass());
            System.out.println(ioE.getMessage());
            System.exit(-1);
        }

        int max = 1;
        for (int i = 1; i < Math.max(x, y); i++){
            if (x%i == 0 && y%i == 0)
                max = i;
        }

        System.out.println(max);

    }
}
