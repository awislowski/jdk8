import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10StreamBulkOperations {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("Tomasz", "Lis"), new Person("Donald", "Tusk"), new Person("Jarosław", "Kaczyński"), new Person("Tomasz", "Kłos"));

        //grouping
        System.out.println(
        list.stream().
                filter(p -> p.getLastName().length() < 7).
                collect(Collectors.groupingBy(Person::getFirstName))
        );


        //reduce
        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).
                stream().
                filter(a -> a % 2 == 0).
                map(a -> a * a).
                reduce((a, b) -> a + b).
                getAsInt());

    }

}
