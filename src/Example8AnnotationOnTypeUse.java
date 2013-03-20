import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.annotation.ElementType.TYPE_USE;

public class Example8AnnotationOnTypeUse {
    public static void main(String[] args){

        String a = "successed";

        System.out.print( (@ExampleAnnotation String)a) ;
    }


    @Target({TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExampleAnnotation {
    }


}
