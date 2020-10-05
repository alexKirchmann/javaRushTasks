package Core.Lvl6;

class Lct10_Racing {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            for (int i = numSeconds; i > 0; i--) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("INTERRUPTED!");
                    e.printStackTrace();
                }
            }
            System.out.println("GO!");
        }
    }
}