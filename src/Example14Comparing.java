import java.util.Arrays;
import java.util.Comparators;
import java.util.List;

public class Example14Comparing {

    public static void main(String[] args){

        List<Person> people = Arrays.asList(new Person("Zbigniew", "Romaszewski"), new Person("Tomasz", "Lis"));
        people.sort(Comparators.comparing( (Person p) -> p.getLastName()));

        System.out.println(people);
    }
}
