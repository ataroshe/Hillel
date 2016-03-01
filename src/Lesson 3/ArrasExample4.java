/**
 * Created by User on 16.02.2016.
 */
public class ArrasExample4 {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 1, 8};
        int min = array[0];

        //проходит подряд по массиву
        for (int element : array) {
            //System.out.println(element);
            min = Math.min(min,element);
        }
        System.out.println(min);
    }
}
