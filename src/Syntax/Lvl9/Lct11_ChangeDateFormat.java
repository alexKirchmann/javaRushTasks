package Syntax.Lvl9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lct11_ChangeDateFormat {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = new Date();

        date = simpleDateFormat1.parse(reader.readLine());
        System.out.println(simpleDateFormat2.format(date).toUpperCase());

    }

}
