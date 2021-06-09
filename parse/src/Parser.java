import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.print.attribute.standard.Chromaticity;

public class Parser {
    private static Document getPage() throws IOException {
        String url="https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html";
        Document page= Jsoup.parse(new URL(url),3000);
        return page;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(getPage());

    }

}
