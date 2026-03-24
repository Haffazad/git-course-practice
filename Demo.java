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

    public static String weeklyAppointments() {

        System.out.println("Which day of the week is it?");
        try (Scanner scan = new Scanner(System.in)) {
            String day = scan.nextLine().toLowerCase().trim();
            String outcome = " ";
            switch (day) {
                case "monday", "wednesday", "friday" -> {
                    if (day.equals("monday")) {
                        outcome = "Appointment with Mr.Romeo at 04:00 PM";
                    } else if (day.equals("wednesday")) {
                        outcome = "No Lesson Appointment Today!";
                    } else
                        outcome = "Appointment with Mr.Romeo and Miss Popoola at 04:00 PM and 6:00 PM respectively";
                }

                case "tuesday", "thursday", "saturday" -> {
                    if (day.equals("tuesday")) {
                        outcome = "Appointment with Miss Ajalaruru at 06:00 PM";
                    } else if (day.equals("thursday")) {
                        outcome = "Appointment with Miss Ajalaruru at 06:00 PM";
                    } else
                        outcome = "Appointment with Mr.Romeo and Mr. Thompson at 12:00 PM and 02:00 PM respectively";
                }

                case "sunday" -> outcome = "Appointment with Mr Aghaulor at 03:00 PM";

                default -> {
                    System.out.println("Enter a valid day of the week. No punctuation marks is needed.");
                    weeklyAppointments();
                }
            }
            return outcome;
        }
    }

    public static void main(String[] args) {

        // reverseString();
        // showString();
        String appointment = weeklyAppointments();
        System.out.println(appointment);
    }
}
