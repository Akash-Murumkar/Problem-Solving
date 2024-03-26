import java.util.Arrays;

class Sort {

    public static void bubbleSort(int arr[]) {
        boolean flag;

        for (int i = 1; i < arr.length; i++) {
            flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }

    }

}

public class SortMain {
    public static void main(String[] args) {
        int[] array = { 1, 5, 6, 7, 2 };
        System.out.println("Unsorted Array: ");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        Sort.bubbleSort(array);
        System.out.print("\nSorted Array: ");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}