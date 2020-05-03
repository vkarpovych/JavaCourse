import java.util.Scanner;

public class LimitsOfTypesApp {

    private static String choice;

    public static void main(String[] args) {
        boolean minBoolean = Boolean.FALSE;
        boolean maxBoolean = Boolean.TRUE;
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double minDouble = Integer.MIN_VALUE;
        double maxDouble = Integer.MAX_VALUE;

        System.out.println("1 - Boolean");
        System.out.println("2 - Byte");
        System.out.println("3 - Short");
        System.out.println("4 - Char");
        System.out.println("5 - Int");
        System.out.println("6 - Long");
        System.out.println("7 - Float");
        System.out.println("8 - Double");
        System.out.print("Choose a type to print out min/max values for (1-8) or enter 0 to get out of the loop: ");
        Scanner scanner = new Scanner(System.in);
        loop:
        while (scanner.hasNext()) {
            choice = scanner.next();
            switch (choice) {
                case "0":
                    break loop;
                case "1":
                    System.out.println("Min boolean: " + minBoolean);
                    System.out.println("Max boolean: " + maxBoolean);
                    break;
                case "2":
                    System.out.println("Min byte: " + minByte);
                    System.out.println("Max byte: " + maxByte);
                    break;
                case "3":
                    System.out.println("Min short: " + minShort);
                    System.out.println("Max short: " + maxShort);
                    break;
                case "4":
                    System.out.println("Min char: " + minChar);
                    System.out.println("Max char: " + maxChar);
                    break;
                case "5":
                    System.out.println("Min int: " + minInt);
                    System.out.println("Max int: " + maxInt);
                    break;
                case "6":
                    System.out.println("Min long: " + minLong);
                    System.out.println("Max long: " + maxLong);
                    break;
                case "7":
                    System.out.println("Min float: " + minFloat);
                    System.out.println("Max float: " + maxFloat);
                    break;
                case "8":
                    System.out.println("Min double: " + minDouble);
                    System.out.println("Max double: " + maxDouble);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        }
    }
}
