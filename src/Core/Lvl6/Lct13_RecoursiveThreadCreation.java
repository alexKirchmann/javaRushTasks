package Core.Lvl6;

class Lct13_RecoursiveThreadCreation {

    static int count = 15;
    static volatile int createdThreadCount = 0;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    static class GenerateThread extends Thread{

        public GenerateThread () {
            super(Integer.toString(++createdThreadCount));
            start();
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + "created";
        }

        public void run() {
            if (createdThreadCount < Lct13_RecoursiveThreadCreation.count) {
                Thread thread = new GenerateThread();
                System.out.println(thread.toString());
            }
        }
    }
}
