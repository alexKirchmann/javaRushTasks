package Core.Lvl10;

public class Lct10_SquareAlgorithm {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                boolean bUP = false;
                boolean cUP = false;
                try {
                    int n = a[i-1][j];
                    cUP = (n == 0);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    bUP = true;
                }

                boolean bLF = false;
                boolean cLF = false;
                try {
                    int n = a[i][j-1];
                    cLF = (n == 0);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    bLF = true;
                }

                if (a[i][j] == 1 && (bUP || cUP) && (bLF || cLF)) {
                    count++;
                }
            }
        }
        return count;
    }
}
