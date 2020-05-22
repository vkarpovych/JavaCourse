import java.util.Scanner;

public class FibonacciPrinter {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner scanner = new Scanner(System.in);
        Fibonacci(scanner.nextInt());
    }

    public static void Fibonacci(int n) {
        int i = 0;
        int prev = 0;
        int next = 1;
        while (i < n) {
            System.out.println(prev);
            int temp = prev;
            prev = next;
            next = temp + next;
            i++;
        }
    }
}
