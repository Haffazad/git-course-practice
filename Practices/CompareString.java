package Practices;

import java.util.ArrayList;
import java.util.List;

public class CompareString {

    public static void compare() {

        String a = "java";
        String b = "java";

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void concatenate() {
        String a = "java";
        String b = a.concat("Script");
        System.out.println(b);
    }

    public static void addToList() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Before Removing Elements");
        System.out.println(list);

        for (String s : list) {
            list.remove(s);
        }

        System.out.println("After Removing Elements");
        System.out.println(list);
    }

    public static void compareinteger() {

        Integer a = 128;
        Integer b = 128;

        System.out.println(a == b);
    }

    public static void main(String[] args) {

        // CompareString compare = new CompareString();
        // compare();
        concatenate();
        // addToList();
        compareinteger();

    }

}
