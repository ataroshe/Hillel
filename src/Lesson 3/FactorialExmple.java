/**
 * Created by User on 16.02.2016.
 */
public class FactorialExmple {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        while (i <= 5) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}
