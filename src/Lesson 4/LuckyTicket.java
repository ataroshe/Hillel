/**
 * Created by User on 19.02.2016.
 */
public class LuckyTicket {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 100000; i <= 999999; i++) {
            int n1 = i / 100000 % 10;
            int n2 = i / 10000 % 10;
            int n3 = i / 1000 % 10;
            int n4 = i / 100 % 10;
            int n5 = i / 10 % 10;
            int n6 = i % 10;
            if ((n1 + n2 + n3) == (n4 + n5 + n6)) {
                amount ++;
            }
        }
        System.out.println(amount);
    }
}
