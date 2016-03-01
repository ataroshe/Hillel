import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 19.02.2016.
 */
public class IO {
    public static void main(String[] args) {
        System.out.println("Type the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList io = new ArrayList();
        while (n > 0) {
            int bin = n % 2;
            io.add(n % 2);
            n = n / 2;
        }
        for (int i = io.size(); i >= 0; --i)
            System.out.println(io.get(i-1));
    }
}
