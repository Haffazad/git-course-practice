import java.util.Scanner;

public class Demo {

    public static String inputName() {
        System.out.println("Please enter your name: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");

            return name;
        }
    }

    // private static String word = "maryam";

    public static void reverseString() {
        char[] charArray = inputName().toCharArray();

        System.out.println("Before reversing...");
        System.out.print("[");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.print("]");

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        System.out.println("\n");
        System.out.println("After reversing...");
        System.out.println("Your reverse name is: ");

        System.out.print("[");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.print("]");

    }

    public static void runReverseString() {

        while (true) {
            reverseString();
            System.out.println();
        }

    }

    public static void showString() {
        String x = "Start";
        String y = new String("Start");
        System.out.println();
        System.out.println("String x equals String y is: " + x.equals(y));
    }

    public static void main(String[] args) {

        reverseString();
        showString();
    }
}