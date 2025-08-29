package lec6_arayl;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {

    public static ArrayList<String> findCommon(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> common = new ArrayList<>();
        for (String item : list1) {
            if (list2.contains(item) && !common.contains(item)) {
                common.add(item);
            }
        }
        return common;
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Orange", "Mango"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Grape", "Orange", "Pineapple", "Apple"));

        ArrayList<String> result = findCommon(list1, list2);
        System.out.println(result);
    }
}
