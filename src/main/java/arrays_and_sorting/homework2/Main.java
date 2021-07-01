package arrays_and_sorting.homework2;

import java.util.Random;

public class Main {
    final static int COUNT = 100_000;

    public static void main(String[] args) {
        long startTime;
        long endTime;

        Random random = new Random();
        MyArrayList<Integer> mal_1 = new MyArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            mal_1.add(random.nextInt(COUNT));
        }

        startTime = System.nanoTime();
        mal_1.selectionSort();
        endTime = System.nanoTime();
        System.out.println("Сортировка методом выбора: " + ((double)(endTime - startTime)/1_000_000_000.0));

        MyArrayList<Integer> mal_2 = new MyArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            mal_2.add(random.nextInt(COUNT));
        }

        startTime = System.nanoTime();
        mal_2.insertionSort();
        endTime = System.nanoTime();
        System.out.println("Сортировка методом вставки: " + ((double)(endTime - startTime)/1_000_000_000.0));

        MyArrayList<Integer> mal_3 = new MyArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            mal_3.add(random.nextInt(COUNT));
        }

        startTime = System.nanoTime();
        mal_3.bubbleSort();
        endTime = System.nanoTime();
        System.out.println("Пузырьковая сортировка: " + ((double)(endTime - startTime)/1_000_000_000.0));

        /**
         *  Сортировка методом выбора: 29.574534217
         *  Сортировка методом вставки: 45.211871286
         *  Пузырьковая сортировка: 125.499011085
         **/
    }
}

