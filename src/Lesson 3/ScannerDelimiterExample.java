import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScannerDelimiterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        int a = 0;
        int b = 0;

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        }

        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        //нужно вводить 2 запятые
        System.out.println(a + b);
    }
}
