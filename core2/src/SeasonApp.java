import java.util.Scanner;

public class SeasonApp {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String currentMonth = scanner.next();
        Season season;
        switch (currentMonth) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
