package Core.Lvl9.Lct3_PersonAdapter;

import java.util.Date;

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}
