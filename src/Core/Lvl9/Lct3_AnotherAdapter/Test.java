package Core.Lvl9.Lct3_AnotherAdapter;

public class Test {
    public static void main(String[] args) {
        String all="+(356)8-09";
        String number = all.replaceAll("\\)","");
        String number1 = number.replaceAll("\\(","");
        String number2 = number1.replaceAll("-","");
        System.out.println(number2);
    }
}
