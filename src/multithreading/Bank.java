package multithreading;

import pattern.observer.Observer;

/**
 * Created by User on 29.04.2016.
 */
public class Bank {
    private long account1 = 10_000_000;
    private long account2 = 10_000_000;

    final Object lock = new Object();

    public synchronized void transfer(boolean direction, int amount) {
        if (direction) {
            account1 -= amount;
            account2 += amount;
        } else {
            account1 += amount;
            account2 -= amount;
        }
    }

    public synchronized void check() {
        String message = "";

        if (account1 + account2 != 20_000_000) {
            message = "Something wrong happened!";
        }
        message += "Account 1 = " + account1;
        message += "Account 2 = " + account2;

        System.out.println(message);

    }


}
