import java.util.Random;
import java.util.stream.IntStream;

public class OddAndEvenIntegersSumPrinterV2 {

    public static void main(String[] args) {

        /* Generate an array of random integers */
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(100)).limit(20).toArray();
        int sumOdds = 0;
        int sumEvens = 0;
        System.out.print("Integers:");
        for (Integer item : randomIntsArray) {
            System.out.print(" " + item);
            if (item % 2 == 0)
                sumEvens += item;
            else
                sumOdds += item;
        }
        System.out.print("\n");
        System.out.println("Sum of odds: " + sumOdds);
        System.out.println("Sum of evens: " + sumEvens);
    }
}
