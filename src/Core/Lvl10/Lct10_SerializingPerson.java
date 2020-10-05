package Core.Lvl10;

import java.io.*;
import java.util.logging.Logger;

class Lct10_SerializingPerson {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oIS = new ObjectInputStream(new FileInputStream("D:/Фото/Новый текстовый документ.txt"));
        ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream("D:/Фото/Новый текстовый документ.txt"));

        Person person1 = new Person("Alex", "Kirchmann", "Ukraine", Sex.MALE);
        Person person2 = new Person("Kristina", "Coubasova", "Ukraine", Sex.FEMALE);

        oOS.writeObject(person1);
        person2 = (Person) oIS.readObject();

        System.out.println(person2.fullName);
    }




    static class Person implements Serializable {
        String firstName;
        String lastName;
        String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }
}
