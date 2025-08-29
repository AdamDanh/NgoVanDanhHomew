package lec6_arayl;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingElementsfromanArrayListduringIteration {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 60, 25, 80, 5, 95));

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > 50) {
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
