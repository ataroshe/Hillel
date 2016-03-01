import java.util.Scanner;

/**
 * Created by User on 19.02.2016.
 */
public class ArrayInputFromConsole {
    public static void main(String[] args) {
        int[] array = Utils.getArrayFromConsole();
        int sum = findTheSumofAllElementsOfTheArray(array);

        Utils.printArray(array);
        System.out.println("Sum is " + sum);
    }

    private static int findTheSumofAllElementsOfTheArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

