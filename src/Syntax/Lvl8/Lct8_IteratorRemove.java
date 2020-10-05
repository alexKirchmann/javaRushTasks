package Syntax.Lvl8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Lct8_IteratorRemove {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Iterator<Integer> iterator = set.iterator();

        for (int i = 0; i<10; i++){
            set.add((int) (Math.random() * 20));
        }

        while (iterator.hasNext()){
            if (iterator.next() > 10){
                iterator.remove();
            }
        }
    }
}
