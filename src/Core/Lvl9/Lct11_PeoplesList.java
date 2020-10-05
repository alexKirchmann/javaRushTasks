package Core.Lvl9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Lct11_PeoplesList {
    static ArrayList<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat sDF = new SimpleDateFormat("dd MM yyyy");

        while (reader.ready()) {
            String line = reader.readLine();
            String[] lineParts = line.split(" ");

            String name = "";
            for (int i = 0; i < lineParts.length-3; i++){
                if (i == line.length()-4)
                    name = name + lineParts[i];
                else
                    name = name + lineParts[i] + " ";
                }

            Date bd = sDF.parse(lineParts[lineParts.length-3] + " " + lineParts[lineParts.length-2] + " " + lineParts[lineParts.length-1]);

            PEOPLE.add(new Person(name, bd));
            }

        reader.close();

        }



    static class Person {
        private String name;
        private Date birthDate;

        public Person(String name, Date birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public String getName() {
            return name;
        }

        public Date getBirthDate() {
            return birthDate;
        }
    }
}
