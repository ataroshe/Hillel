package multithreading;

/**
 * Created by User on 29.04.2016.
 */
public class NumberPrinter implements Runnable{
    public void run(){
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        for (int i = 0; i <= 10; i++) {
            try {
                // to slow the start of the thread
                Thread.sleep(10);
            } catch (InterruptedException ignored) {
                //ignored to avoid printStackTrace
                currentThread.interrupt();
            }
            System.out.println(name + " " + i);
            if (currentThread.isInterrupted()){
                return;
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
