// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

package tasks;

import java.util.List;

public class FindMinMaxArithmeticMean {
    public static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }

    public static float findArithmeticMean(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        float ArithmeticMean = (float) sum / list.size();
        return ArithmeticMean;
    }
}
