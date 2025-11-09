package Practicum.Sprint_6.insertionShort;

import java.util.Arrays;

public class Practicum {
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 0, 1, 3, 4, 9};
        System.out.println(Arrays.toString(array));

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            // key - значение, которое нужно вставить в правильное, место,
            // чтобы массив [0, ..., i] остался отсортированным
            int key = array[i];
            // j начинает расстраивать элементы с конца отсортированной части массива
            int j = i - 1;
            /*
             * Передвигаем элементы массива [0, .., i - 1], которое больше ключа
             * на одну позицию вперед относительно их текущей позиции.
             * Сначала передвигаем элементы, которые ближе к правому краю.
             */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;

            }
            /*
            * К этой строке массив [0, .., j] отсортирован и все его элементы меньше key.
            * В то же время массив [j + 2, .., i] отсортирован и все его элементы больше key.
            * Если вставить key на место j + 1 весь массив [0, .., i] станет отсортированным.
             */
            array[j + 1] = key;
        }
    }

}
