import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

public class Example9ParallelSort {
    public static void main(String[] args){

        List<String> strings = buildList(14234567);
        Instant p1 = Instant.now();
        Arrays.parallelSort(strings.toArray(new String[strings.size()]));
        System.out.println(Duration.between(Instant.now(),p1));

    }

    private static <T> T ab(T b){

        System.out.print( (@SuppressW  String)b) ;
        return b;
    }

    @Target({TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SuppressW {
    }

    private static List<String> buildList(Integer n) {
        List<String> ret = new ArrayList<String>();
        for (int i = n; i > 0  ; i--)
            ret.add(Integer.toString(i));
        return ret;
    }

}
