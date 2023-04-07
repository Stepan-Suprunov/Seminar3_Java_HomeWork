// Домашнее задание к семинару №3 JAVA API Супрунов Степан

import tasks.ArrayDifference;
import tasks.FindMinMaxArithmeticMean;
import tasks.MergeSort;
import tasks.RemoveOddNumbers;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arrayForMergeSort = MergeSort.getRandomArray();
        MergeSort.mergeSort(arrayForMergeSort);
        System.out.println(Arrays.toString(arrayForMergeSort));
        System.out.println();
        RemoveOddNumbers.deleteOddNumbers(RemoveOddNumbers.getRandomList());
        System.out.println();
        List<Integer> randomListOfIntegers = RemoveOddNumbers.getRandomList();
        System.out.println(randomListOfIntegers);
        System.out.println(FindMinMaxArithmeticMean.findMin(randomListOfIntegers));
        System.out.println(FindMinMaxArithmeticMean.findMax(randomListOfIntegers));
        System.out.println(FindMinMaxArithmeticMean.findArithmeticMean(randomListOfIntegers));
        System.out.println();
        int[] arrayForDifference1 = MergeSort.getRandomArray();
        int[] arrayForDifference2 = MergeSort.getRandomArray();
        System.out.println(Arrays.toString(arrayForDifference1));
        System.out.println(Arrays.toString(arrayForDifference2));
        ArrayDifference.getArrayDifference(arrayForDifference1, arrayForDifference2);
    }
}
