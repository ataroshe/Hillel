import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class Bill {
    public static void main(String[] args) {
        int amount = 100;
        System.out.println("Input rating: terrible, good, nice, great");
        Scanner scanner = new Scanner(System.in);
        String rating = scanner.nextLine();

        switch (rating) {
            case "terrible":
                amount *= 0.00;
                break;
            case "good":
                amount *= 0.05;
                break;
            case "nice":
                amount *= 0.1;
                break;
            case "great":
                amount *= 0.2;
                break;
            default:
                amount = 0;
        }


        System.out.println("Tips are: " + amount);
    }
}
