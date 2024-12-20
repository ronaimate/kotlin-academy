package academy.learnprogramming.generics.javacode;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics2 {

    public static void main(String[] args) {

        var strings = new ArrayList<String>();
        strings.add("Hello");

        boolean b = strings instanceof List; // we cant: instanceof List<String> - syntax error
    }
}
