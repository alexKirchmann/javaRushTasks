package Core.Lvl6;

class Lct3_ThreadsStackTrace {

    static class SpecialThread implements Runnable {

        public static void main(String[] args) {
            Thread thread = new Thread(new SpecialThread());
            thread.start();

            System.out.println("----------------");

            for (StackTraceElement stackTraceElement : thread.getStackTrace()){
                System.out.println(stackTraceElement);
            }

        }

        @Override
        public void run() {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()){
                System.out.println(stackTraceElement);
            }
        }
    }
}
