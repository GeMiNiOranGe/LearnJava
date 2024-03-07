package basic;

public class BasicDataType {
    public static void show() {
        // declare variables
        boolean isDone = true;
        byte tinyNumber = 100;
        short smallNumber = 10000;
        int number = 1000000000;
        long bigNumber = 10000000000l;

        float floatNumber = 1.55f;
        double doubleNumber = 1.55;

        char singleChar = 'a';

        // print to console
        System.out.println(isDone);
        System.out.println(tinyNumber);
        System.out.println(smallNumber);
        System.out.println(number);
        System.out.println(bigNumber);

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        System.out.println(singleChar);
    }
}
