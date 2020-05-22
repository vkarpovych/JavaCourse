public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("1 to 10:");
        for (int i = 1; i <= 10; i++)
            switch (i) {
                case 5:
                    System.out.println("Five");
                case 7:
                    continue;
                default:
                    System.out.println(i);
            }
        System.out.println("20 to 0:");
        for (int i = 20; i >= 0; i--)
            switch (i) {
                case 5:
                    System.out.println("Five");
                case 7:
                    continue;
                default:
                    System.out.println(i);
            }
    }
}
