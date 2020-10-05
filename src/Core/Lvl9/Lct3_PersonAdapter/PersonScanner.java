package Core.Lvl9.Lct3_PersonAdapter;

import java.io.IOException;
import java.text.ParseException;

interface PersonScanner {
    Person read() throws IOException, ParseException;
    void close() throws IOException;
}
