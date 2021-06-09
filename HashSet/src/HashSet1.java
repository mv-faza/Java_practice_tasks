import java.util.*;
class HashSet1 {
    public static void main(String[] args){
        HashSet<String> h = new HashSet<String>();

        h.add("Tashkent");
        h.add("Shweden");
        h.add("Amsterdam");
        h.add("Norway");
        h.add("Moscow");
        h.add("Dubai");
        System.out.println(h);
        System.out.println("List contain Norway or not: "+h.add("Norway"));

        h.remove("Tashkent");
        System.out.println("List is not contain Tashkent" +h);

        System.out.println("Iterating over list");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}

