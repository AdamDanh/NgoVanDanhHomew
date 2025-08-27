
package lec6_arayl;
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicateElements {

    // Hàm loại bỏ phần tử trùng lặp
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (!result.contains(num)) {  // If chua co trong result thi add vao
                result.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Enter data
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers (may contain duplicates):");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        // Goi ham loai bo trung lap
        ArrayList<Integer> uniqueList = removeDuplicates(numbers);

        // In ket qua
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + uniqueList);
        scanner.close();
    }
}

