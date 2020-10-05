package Syntax.Lvl10;

public class Lct4_ConvertingToNine {

    public static void main(String[] args) {

            short number = 9;
            char zero = '0';
            int nine = (zero + number);
            System.out.println((char) nine);

    }

}

//Додаючи "char" біля дев'ятки ми переводимо число 57 (0 -- це 48 в Юнікоді, тому чар-овий 0 + 9 = 57)
//в Юнікод, а, значить, отримуємо число під Юні-номером 57 -- дев'ятку.
