package Practice4.bonus.app;

import Practice4.bonus.model.CountingSort;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    static void main() {
        List<Integer> list = new ArrayList<>(List.of(
                -1, 2, 3, 4, 3, 3, 3, 6, 7, -1, 1, 9, 3, 2
        ));

        CountingSort.sort(list);
        list.forEach(n -> System.out.print(n + " "));
    }
}
