// Реализовать алгоритм сортировки слиянием

package tasks;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static int[] getRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[random.nextInt(9, 50)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(randomArray));
        return randomArray;
    }

    public static void mergeSort(int[] array) {
        if (array.length == 1) return;
        int[] array1 = Arrays.copyOfRange(array, 0, (array.length + 1) / 2);
        int[] array2 = Arrays.copyOfRange(array, (array.length + 1) / 2, array.length);
        mergeSort(array1);
        mergeSort(array2);
        mergeArrays(array, array1, array2);
    }

    public static void mergeArrays(int[] array, int[] array1, int[] array2) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        while (count1 < array1.length && count2 < array2.length) {
            if (array1[count1] < array2[count2]) {
                array[count] = array1[count1];
                count1++;
                count++;
            } else {
                array[count] = array2[count2];
                count2++;
                count++;
            }
        }
        for (int i = count1; i < array1.length; i++) {
            array[count++] = array1[count1];
        }
        for (int j = count2; j < array2.length; j++) {
            array[count++] = array2[count2];
        }
    }
}
