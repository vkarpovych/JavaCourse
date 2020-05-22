import java.util.Scanner;

public class OddAndEvenIntegersSumPrinterV1 {
    public static void main(String[] args) {
        int sumOdds = 0;
        int sumEvens = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input % 2 == 0)
                sumEvens += input;
            else
                sumOdds += input;
            System.out.println("Sum of odds: " + sumOdds);
            System.out.println("Sum of evens: " + sumEvens);
        }
    }
}
