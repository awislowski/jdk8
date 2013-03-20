import java.util.*;

public class Example11CollectionExtended {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>(Arrays.asList("Andrzej", "Adam", "Aleksy"));

        //Collection.remove(Predicate)
        set.removeAll(e -> e.length() < 5);
        System.out.println(set);

        //List.replaceAll
        List<String> list = Arrays.asList("Andrzej", "Adam", "Aleksy");
        list.replaceAll(a -> a + "1");
        System.out.println(list);

        //List.sort
        list.sort(Comparators.naturalOrder());
        System.out.println(list);

    }

}
