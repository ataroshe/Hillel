package ImprovedArray;

public class MainImpArr {
    public static void main(String[] args) {
        ImprovedArray firstArraay = new ImprovedArray();
        firstArraay.add("1");
        firstArraay.add("2");
        firstArraay.add("3");
        firstArraay.add("4");
        firstArraay.add("5");
        firstArraay.add("6");
        firstArraay.add("7");
        firstArraay.add("8");
        firstArraay.add("9");
        firstArraay.add("10");
        firstArraay.add("11");
        firstArraay.add("12");
        firstArraay.add("13");
        firstArraay.add("14");
        System.out.println("firstArray is: " + firstArraay.toString());
        System.out.println("first array element 2 is : " + firstArraay.get(1));
        System.out.println("first array size is: " + firstArraay.size());

        ImprovedArray secondArray = new ImprovedArray();
        secondArray.add("1");
        secondArray.add("2");
        secondArray.add("3");
        secondArray.add("4");
        secondArray.add("5");
        secondArray.add("6");
        secondArray.add("7");
        secondArray.add("8");
        secondArray.add("9");
        secondArray.add("10");
        secondArray.add("11");
        secondArray.add("12");
        secondArray.add("13");
        secondArray.add("14");

        System.out.println("second array is: " + secondArray);

        System.out.println("arrays are equal: " + firstArraay.equals(secondArray));


    }
}
