package Syntax.Lvl8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Lct2_IteratorInSet {

    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора для множества (Set-a)
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }
}
