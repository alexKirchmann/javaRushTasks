package Core.Lvl7.Lct10_CRUD2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class Process {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try{
            switch(args[0])
            {
                case"-c":
                    synchronized(allPeople){
                        for(int i=0;i<=args.length - 2; i+=3)
                        {
                            if (args[2+i].equals("м")) {
                                allPeople.add(Person.createMale(args[1+i], dateFormat.parse(args[3+i])));
                            } else {
                                allPeople.add(Person.createFemale(args[1+i], dateFormat.parse(args[3+i])));
                            }
                            System.out.println(allPeople.size() - 1);
                        }}
                    break;
                case"-u":
                    synchronized(allPeople){
                        for(int i=0;i<=args.length - 2; i+=4)
                        {
                            Person person = allPeople.get(Integer.parseInt(args[1+i]));
                            if (args[3+i].equals("м")) {
                                person.setName(args[2+i]);
                                person.setSex(Sex.MALE);
                                person.setBirthDate(dateFormat.parse(args[4+i]));
                            } else {
                                person.setName(args[2]);
                                person.setSex(Sex.FEMALE);
                                person.setBirthDate(dateFormat.parse(args[4+i]));
                            }
                        }}
                    break;
                case"-d":
                    synchronized(allPeople){
                        for (int i=0;i<args.length;i++){
                            Person person = allPeople.get(Integer.parseInt(args[1+i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }}
                    break;
                case"-i":
                    synchronized(allPeople){
                        for (int i=0;i<args.length;i++){
                            Person person = allPeople.get(Integer.parseInt(args[1+i]));
                            if (person.getSex() == Sex.MALE) {
                                System.out.println(person.getName() + " м " + dateFormat1.format(person.getBirthDate()));
                            } else {
                                System.out.println(person.getName() + " ж " + dateFormat1.format(person.getBirthDate()));

                            }
                        }}
                    break;
            }
        }
        catch(Exception e)
        {}
    }
}
