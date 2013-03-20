import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;


public class Example4StaticReference {

    public static void main(String[] args) {
        //jdk7
        for(Integer number : Arrays.asList(1, 2, 3, 4))
            System.out.println(number);

        //jdk8
        Arrays.asList(1, 2, 3, 4).forEach( a -> System.out.println(a));
        Arrays.asList(1, 2, 3, 4).forEach(System.out::println);

    }
}
