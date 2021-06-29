package arrays_and_sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *   Данный класс реализовал с целью тренировки
 */

public class HomeWork_2 {

    private static int[] array;
    private static int j = 0;
    private static final int COUNT = 100_000;

    public static void main(String[] args) {
        long startTime;
        long endTime;

//        array = new int[COUNT];
//        filling(array.length);
//        System.out.println(Arrays.toString(array));
//        Scanner s = new Scanner(System.in);
//        int number = s.nextInt();
//        System.out.println(find(number));
//        delete(number);

        array = new int[COUNT];
        filling(array.length);
        startTime = System.nanoTime();
        bubbleSorting();
        endTime = System.nanoTime();
        System.out.println("Пузырьковая сортировка: " + ((double)(endTime - startTime)/1_000_000_000.0));

        array = new int[COUNT];
        filling(array.length);
        startTime = System.nanoTime();
        sortingSelection();
        endTime = System.nanoTime();
        System.out.println("Сортировка методом выбора: " + ((double)(endTime - startTime)/1_000_000_000.0));

        array = new int[COUNT];
        filling(array.length);
        startTime = System.nanoTime();
        sortingInsertion();
        endTime = System.nanoTime();
        System.out.println("Сортировка методом вставки: " + ((double)(endTime - startTime)/1_000_000_000.0));

        /**
         * Пузырьковая сортировка: 28.462691717
         * Сортировка методом выбора: 12.061856209
         * Сортировка методом вставки: 1.552900257
         */
    }

    public static void add(int x) {
        try {
            array[(int) (Arrays.stream(array).filter(i -> i != 0).count())] = x;
        } catch (ArrayIndexOutOfBoundsException e) {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = x;
        }
    }

    public static boolean find(int x) {
        for (j = 0; j < array.length; j++) {
            if (array[j] == x)
                return true;
        }
        return false;
    }

    public boolean binaryFind(int x){
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == array[mid]) {
                return true;
            } else {
                if (x < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public static void delete(int x) {
        int n = array.length;
        find(x);

        if (find(x)) {
            for (int k = j; k < n - 1; k++) {
                array[k] = array[k + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void filling(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            add(random.nextInt(count));
        }
    }

    public static void bubbleSorting() {
        int x, y;
        for (y = array.length - 1; y >= 1; y--) {
            for (x = 0; x < y; x++) {
                if (array[x] > array[x + 1]) {
                    change(x, x + 1);
                }
            }
        }
    }

    private static void change(int x, int y) {
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }

    public static void sortingSelection() {
        int x, y, z;
        for (y = 0; y < array.length; y++) {
            x = y;
            for (z = y + 1; z < array.length; z++) {
                if (array[z] < array[x]) {
                    x = z;
                }
            }
            change(x, y);
        }
    }

    public static void sortingInsertion() {
        int temp;
        int y, x;
        for (x = 1; x < array.length; x++) {
            temp = array[x];
            y = x;
            while (y > 0 && array[y - 1] >= temp) {
                array[y] = array[y - 1];
                --y;
            }
            array[y] = temp;
        }
    }
}

