import java.util.Arrays;

class Sort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}

public class SortMain {
    public static void main(String[] args) {
        int[] array = { 44, 22, 77, 66, 55, 11, 88 };
        System.out.print("Unsorted Array: ");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        Sort.selectionSort(array);
        System.out.print("\nSorted Array: ");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}