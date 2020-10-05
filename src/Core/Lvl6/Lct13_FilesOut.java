package Core.Lvl6;

import java.io.*;

public class Lct13_FilesOut {
    static String firstFileName;
    static String secondFileName;
    static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e){
            e.getCause();
            e.getMessage();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface rfi = new ReadFileThread();
        rfi.setFileName(fileName);
        rfi.start();
        rfi.join();
        System.out.println(rfi.getFileContent());
    }



    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }



    static class ReadFileThread extends Thread implements ReadFileInterface {
        private String filename = "";
        public String content = "";

        public void setFileName(String fullFileName){
            this.filename = fullFileName;
        }

        public String getFileContent(){
            return content;
        }

        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));

                while(bufferedReader.ready()){
                    content=content+bufferedReader.readLine()+" ";
                }

                bufferedReader.close();
            } catch (IOException e) {
                e.getCause();
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }



}
