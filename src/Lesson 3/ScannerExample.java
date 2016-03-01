import java.util.Scanner;

/**
 * Created by User on 16.02.2016.
 */
public class ScannerExample {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner s = new Scanner(System.in);
        System.out.println("input first number: ");
        a = s.nextInt();
        System.out.println("inpur one more: ");
        b = s.nextInt();

        int sum = a + b;
        System.out.printf("The sum is " + sum);
    }
}
