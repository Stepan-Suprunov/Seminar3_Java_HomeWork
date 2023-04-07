// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoveOddNumbers {
    public static List<Integer> getRandomList() {
        List<Integer> randomListOfIntegers = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(10, 50);
        for (int i = 0; i < size; i++) {
            randomListOfIntegers.add(random.nextInt(-99, 100));
        }
        return randomListOfIntegers;
    }

    public static void deleteOddNumbers(List<Integer> list) {
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
