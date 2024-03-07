package basic;

import java.util.Random;

public class BasicArray {
    public static void showArray1D() {
        int[] arrInt = new int[10];
        Random random = new Random();

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(0, 10);
        }

        System.out.println("Array 1D:");
        for (int element : arrInt) {
            String result = String.format("%2d ", element);
            System.out.print(result);
        }
    }

    public static void showArray2D() {
        int[][] arrInt = new int[5][10];
        Random random = new Random();

        for (int row = 0; row < arrInt.length; row++) {
            for (int column = 0; column < arrInt[row].length; column++) {
                arrInt[row][column] = random.nextInt(0, 10);
            }
        }

        System.out.println("Array 2D:");
        for (int[] rows : arrInt) {
            for (int element : rows) {
                String result = String.format("%2d ", element);
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
