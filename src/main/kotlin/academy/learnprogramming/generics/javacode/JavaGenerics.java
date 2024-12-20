package academy.learnprogramming.generics.javacode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Hello");
//        list.add(new BigDecimal(10.5));
        list.get(0).toUpperCase();

        var list1 = new ArrayList<>();
        list1.add("Goodbye");
    }
}
