import java.lang.annotation.*;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Example6RepeatedAnnotations {

    public static String paramName;

    @Schedule("21")
    @Schedule("22")
    public static void main(String[] bb) {

        Arrays.asList(new Example6RepeatedAnnotations().getClass().getDeclaredMethods())
                .stream()
                .filter(m -> "main".equals(m.getName()))
                .findFirst()
                .ifPresent(m -> System.out.println("annotations: " + m.getAnnotations()[0]));

        System.out.println("Params:");
        //parameter name
        Arrays.asList(new Example6RepeatedAnnotations().getClass().getDeclaredMethods())
                .stream()
                .filter(m -> "example".equals(m.getName()))
                .flatMap(m -> Arrays.asList(m.getParameters()).stream())
                .map(Parameter::getName)
                .forEach(System.out::println);


        System.out.println("All methods:");
        //ciekawostka mamy lambdy !!!
        Arrays.asList(new Example6RepeatedAnnotations().getClass().getDeclaredMethods())
                .stream()
                .forEach( m -> System.out.println(m.getName()));
    }

    public static void example(String a, String b) {

    }


    @Repeatable(Schedules.class)
    @interface Schedule{
      String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Schedules {
        Schedule[] value();
    }
}
