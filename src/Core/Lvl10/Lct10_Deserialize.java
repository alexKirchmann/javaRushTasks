package Core.Lvl10;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Lct10_Deserialize {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object o = objectStream.readObject();
            if (o instanceof A) return (A) o;
            else return null;
        }
       catch (IOException | ClassNotFoundException e) {
           System.out.println("!!!");
           return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
