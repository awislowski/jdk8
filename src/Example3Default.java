import java.util.ArrayList;
import java.util.Arrays;

public class Example3Default {
    public static void main(String[] args){

        //default method
        System.out.println(new B().name());

        System.out.println(new C().name());

        //more general
        System.out.println(new D().name("param"));
    }

    interface A {
        default String name() {
            return "default method";
        }
    }

    static class B implements A{
    }

    static class C implements A{
        public String name() {
            return "overriden method ";
        }
    }

    static class D implements F, E{
    }

    interface E extends G {
        default String name(String s) {
            return "more specific";
        }
    }

    interface F {
        default String name(CharSequence s) {
            return "more general";
        }
    }

    interface G {
        default String name(String s) {
            return "more specific 1";
        }
    }


}
