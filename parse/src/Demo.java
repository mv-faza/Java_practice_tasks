import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Demo {


    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\User\\Desktop\\Afr.txt";
        HashMap<String, String> map = new HashMap<String, String>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            }
        }

        for (String key : map.keySet())
        {
            System.out.println(key + ":" + map.get(key));
        }
        reader.close();
    }
}































/*static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("1. Africa");
        System.out.println("2. Antarctica");
        System.out.println("3. Asia");
        System.out.println("4. Europe");
        System.out.println("5. North America");
        System.out.println("6. Oceania");
        System.out.println("7. South America");
        a = scan.nextInt();
        HashMap<String, String> map = new HashMap<String, String>();

        Document doc = Jsoup.connect("https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html").get();
        String title = doc.title();
    }
}*/


















       /* if (a==1){
                File input = new File("C:\\Users\\User\\Desktop\\Afr.txt");
                map.get("Africa",doc.getElementsByTag("tbody"));



        }
        else if (a==2){
                File input1 = new File("C:\\Users\\User\\Desktop\\new1.html");
                Document doc2 = Jsoup.parse(input1, "UTF-8", "https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html");
                System.out.println(doc2);
        }
        else if (a==3){
            File input1 = new File("C:\\Users\\User\\Desktop\\new2.html");
            Document doc3 = Jsoup.parse(input1, "UTF-8", "https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html");
            System.out.println(doc3);}
        else if (a==4){
            File input1 = new File("C:\\Users\\User\\Desktop\\new3.html");
            Document doc4 = Jsoup.parse(input1, "UTF-8", "https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html");
            System.out.println(doc4);}
        else if (a==5){
            File input1 = new File("C:\\Users\\User\\Desktop\\new4.html");
            Document doc5 = Jsoup.parse(input1, "UTF-8", "https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html");
            System.out.println(doc5);}
        else if (a==6){
            File input1 = new File("C:\\Users\\User\\Desktop\\new5.html");
            Document doc6 = Jsoup.parse(input1, "UTF-8", "https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html");
            System.out.println(doc6);}
        else if (a==7){
            File input1 = new File("C:\\Users\\User\\Desktop\\new7.html");
            Document doc7 = Jsoup.parse(input1, "UTF-8", "https://examples.yourdictionary.com/list-of-all-countries-in-the-world.html");
            System.out.println(doc7);}


        }


    }

*/
