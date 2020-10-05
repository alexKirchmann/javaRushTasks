package Core.Lvl4.Lct8_UserLoserCoderProger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Process {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        
        while (true) {
            input = reader.readLine();
            if (input.equals("user") || input.equals("loser") || input.equals("coder") || input.equals("proger")) {
                    switch (input) {
                        case "user" :
                            doWork(new Person.User());
                            break;
                        case "loser" :
                        doWork(new Person.Loser());
                            break;
                        case "coder" :
                            doWork(new Person.Coder());
                            break;
                        case "proger" :
                            doWork(new Person.Proger());
                            break;
                        default : break;
                    }
            }
            else break;

        }

    }

    static void doWork (Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }

        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }

        if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }

        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
