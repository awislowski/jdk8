import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Example5InferGenericType {

    public static void main(String[] args) {
        //jdk7
        for(Integer number : wrap(1, Collections.<Integer>emptyList()))
            System.out.println("old");
        //jdk8
        for(Integer number : wrap(1, Collections.emptyList()))
            System.out.println("new");

    }

    private static <T> List<T> wrap(T a, List<T> list) {
        return Arrays.asList(a);
    }

}
