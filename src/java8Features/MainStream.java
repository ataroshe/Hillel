package java8Features;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.stream.Collectors.*;

/**
 * Created by User on 13.06.2016.
 */
public class MainStream {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(200, "Red", 9));
        apples.add(new Apple(250, "Green", 10));
        apples.add(new Apple(100, "Green", 11));
        apples.add(new Apple(250, "Yellow", 15));
        apples.add(new Apple(230, "Green", 16));

        Predicate<Apple> isGreen = apple -> apple.getColor().equals("Green");
        Predicate<Apple> isHeavy = apple -> apple.getWeight() > 200;

        Random random = new Random();
        Supplier<Integer> integerSupplier = random::nextInt;


        Stream.generate(integerSupplier)
                .filter(integer -> integer % 2 == 0)
                .limit(10)
                .forEach(System.out::println);

    Supplier<Apple> appleSupplier = Apple::new;

    }

    private static Optional<Apple> parallelSortedStreamExample(List<Apple> apples) {
        Optional<Apple> expensveApple = apples.parallelStream()
                .filter(apple -> apple.getPrice() > 10)
                .sorted(Comparator.comparing(Apple::getColor))
                .findFirst();

        if(expensveApple.isPresent()){
            System.out.println(expensveApple.get());
        }
        return expensveApple;

         /*List<String> colorsList = new ArrayList<>();
                apples.stream()
                        .map(Apple::getColor)
                        .forEach(colorsList::add); тоже можно но зачем*/

    }

    private static boolean ayMatch(List<Apple> apples) {
        return apples.stream()
                    .anyMatch(apple -> apple.getPrice() > 10);
    }

    private static List<String> mapExample(List<Apple> apples) {
        Function<Apple, String> toString = apple -> apple.getColor();
        Predicate<String> isYellow = letter -> !letter.equals("Y");
        Predicate<String> notYellow = isYellow.negate();
        return apples.stream()
        .map(Apple::getColor)
        .map(MainStream::extractFirstChar)
        .filter(notYellow)
        .collect(Collectors.toList());
    }

    public static String extractFirstChar(String string) {
        return string.substring(0,1);
    }

    private static List<Apple> limitExamples(List<Apple> apples) {
        return apples.stream()
                    .filter(Apple::isGreen)
                    .filter(MainStream::isHeavy)
                    .limit(2)
                    .collect(Collectors.toList());
    }

    private static void forEachExample(List<Apple> apples) {
        apples.stream()
                .filter(Apple::isGreen)
                .filter(Apple::isHeavy)
                .forEach(System.out::println);
    }

    public static boolean isGreen(Apple apple) {
        return apple.getColor().equals("Green");
    }

    public static boolean isHeavy(Apple apple) {
        return apple.getWeight() > 200;
    }
}
