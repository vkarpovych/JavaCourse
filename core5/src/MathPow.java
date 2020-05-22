public class MathPow {
    public static void main(String[] args) {
        Power(2, 3);
        Power(3, 4);
        System.out.println(Math.pow(2, 3));
    }

    public static void Power(double a, int b) {
        double result = a;
        for (int i = 1; i < b; i++)
            result *= a;
        System.out.println(result);
    }
}
