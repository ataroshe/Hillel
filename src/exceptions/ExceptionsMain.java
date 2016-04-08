package exceptions;

import java.util.Random;

/**
 * Created by User on 08.04.2016.
 */
public class ExceptionsMain {
    public static void main(String[] args) {

        try {
            dangerStaff();
        } catch (MyOwnOutOfIndexException | ArithmeticException e) {
            System.out.println(e);
        } catch (RuntimeException e){
            System.out.println(e + "bla-bla");
        }

        System.out.println("end of program");
    }



    public static void dangerStaff(){
        if (new Random().nextDouble() > 0.5) {
            doWorkWithLists();
        }
        else {
            devide(1, 0);
        }
    }

    private static void doWorkWithLists(){
        throw new MyOwnOutOfIndexException("bla-bla");
    }

    private static void ucheckedExample() {
        devide(1, 4);
        System.out.println("before try");
        try {
            System.out.println("before divide");
            devide(1, 0);
            System.out.println("after divide");
        } catch (ArithmeticException caughtException) {
            System.out.println("in catch");
            System.out.println(caughtException);
        } finally {
            System.out.println("Hello from Finally block");
        }
        System.out.println("after try");
        devide(6, 7);
    }

    private static void  checkedExample() throws InterruptedException {
        try {
            Thread.sleep(1333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(1333);

    }


    public static void devide(int a, int b) {
        int i = a/b;
    }


}
