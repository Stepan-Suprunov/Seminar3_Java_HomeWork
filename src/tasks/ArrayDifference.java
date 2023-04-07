// Реализовать разность массивов и симметрическую разность.

package tasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayDifference {
    public static void getArrayDifference(int[] array1, int[] array2) {
        int flag = 0;
        List<Integer> arrayDifference1 = new ArrayList<>();
        for (int a1 = 0; a1 < array1.length; a1++) {
            flag = 0;
            for (int a2 = 0; a2 < array2.length; a2++) {
                flag = 0;
                if (array2[a2] == array1[a1]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                arrayDifference1.add(array1[a1]);
        }
        System.out.println("array1 - array2 = " + arrayDifference1);
        List<Integer> arrayDifference2 = new ArrayList<>();
        for (int a2 = 0; a2 < array2.length; a2++) {
            flag = 0;
            for (int a1 = 0; a1 < array1.length; a1++) {
                flag = 0;
                if (array2[a2] == array1[a1]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                arrayDifference2.add(array2[a2]);
        }
        System.out.println("array2 - array1 = " + arrayDifference2);
        arrayDifference1.addAll(arrayDifference2);
        System.out.println("array1 ▲ array2 = " + arrayDifference1);
    }
}
