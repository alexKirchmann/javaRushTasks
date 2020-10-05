package Core.Lvl7.Lct10_CRUD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

class Process {
    static List<Person> allPeople;

    static {
        allPeople.add(Person.createMale("Олекса", new Date()));
        allPeople.add(Person.createMale("Іван", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        Sex sex = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy, Locale.ENGLISH");
        SimpleDateFormat sdfI = new SimpleDateFormat("dd-MMM-yyyy, Locale.ENGLISH");

        switch (args[0]) {
            case "-c":
                if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
                if (args[2].equals("ж")) allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
                break;

            case "-u":
                Person u = allPeople.get(Integer.parseInt(args[1]));
                u.setName(args[2]);
                if (args[3].equals("м")) u.setSex(Sex.MALE);
                if (args[3].equals("ж")) u.setSex(Sex.FEMALE);
                u.setBirthDate(sdf.parse(args[4]));

                allPeople.set(Integer.parseInt(args[1]), u);
                break;

            case "-d":
                allPeople.remove(Integer.parseInt(args[1]));

            case "-i":
                Person i = allPeople.get(Integer.parseInt(args[1]));
                String is = "???";
                if (i.getSex() == Sex.MALE) {is = "м";}
                if (i.getSex() == Sex.FEMALE) {is = "ж";}
                System.out.println(String.format("%s %s %s", i.getName(), is, sdfI.format(i.getBirthDate())));
        }
    }
}
