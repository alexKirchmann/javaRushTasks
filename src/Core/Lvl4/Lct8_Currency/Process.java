package Core.Lvl4.Lct8_Currency;

import java.util.ArrayList;
import java.util.List;

public class Process {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Hrivnya(10));
            allMoney.add(new Euro(20));
            allMoney.add(new Dollar(100));
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
