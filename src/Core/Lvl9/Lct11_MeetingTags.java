package Core.Lvl9;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Lct11_MeetingTags {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(rd.readLine()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }

        reader.close();
        rd.close();

        Document document = Jsoup.parse(stringBuilder.toString(),"", Parser.xmlParser());
        Elements elements = document.select(args[0]);

        for(Element element : elements)
        {
            System.out.println(element);
        }

    }
}
