package Practice4.bonus.models;

import java.util.*;

public class CountingSort {
    public static void sort(List<Integer> list) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (Integer n : list) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        list.sort((a, b) -> {
            int freq = Integer.compare(frequency.get(b), frequency.get(a));
            return (freq != 0) ? freq : Integer.compare(a, b);
        });
    }
}