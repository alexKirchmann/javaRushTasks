package Core.Lvl9.Lct3_PersonAdapter;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Process {

    static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
           this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String personInfo = fileScanner.nextLine();
            String [] personInfoParts = personInfo.split(" ", 4);
            SimpleDateFormat sDF = new SimpleDateFormat("dd MM yyyy");
            return new Person(personInfoParts[0], personInfoParts[1], personInfoParts[2], sDF.parse(personInfoParts[3]));
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }


    }
}
