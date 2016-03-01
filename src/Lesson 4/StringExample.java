import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by User on 19.02.2016.
 */
public class StringExample {
    public static void main(String[] args) {
        String str = "some string";

        char symbol = str.charAt(3);
        System.out.println(symbol);
        int sum = getNumberOfSymbols('s', str);

        System.out.println("Number of s in " +  str + " is " + sum);
        String str2 = str.concat(" cat");
        System.out.println("Concat strings: " + str2);

        String str5 = " Word with spaces ";
        System.out.println(str5.trim());
        String str6 = str5.replace("with", "something");
        System.out.println("replace example: " + str6);

        String str7 = str5.substring(5, 10); //5 inclusive, 10 exclusive
        System.out.println("Substring example: " + str7);

        String[] str8 = str6.split(" ");



    }

    public static int getNumberOfSymbols (char symbol, String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == symbol) {
                sum++;
            }
        }
        return sum;
    }
}
