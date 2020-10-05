package Core.Lvl3;

class Lct6_TomAndJerry {

    public static void main(String[] args) {

    }

    interface Eat {
        void eat();
    }

    interface Edible {
        void beEaten();
    }

    interface Movable {
        void move();
    }

    static class Cat implements Movable, Eat, Edible {

        @Override
        public void move(){}

        @Override
        public void eat(){}

        @Override
        public void beEaten(){}

    }

    static class Dog implements Movable, Eat {

        @Override
        public void move(){}

        @Override
        public void eat(){}

    }

    static class Mouse implements Movable, Edible {

        @Override
        public void move(){}

        @Override
        public void beEaten() {

        }
    }
}
