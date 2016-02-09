/**
 * Created by User on 09.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        String message = "Hello world1";
        int birthYear = 1987;
        int age = 2016 - birthYear;

        long years = 2016;

        int intYears = (int) years;
       // long millisecondsFromBC = 2016L * 365L * 24L * 3600L * 1000L;
        long millisecondsFromBC = (long) 2016 * 365 * 24 * 3600 * 1000;
        System.out.println(millisecondsFromBC);
    }
}
