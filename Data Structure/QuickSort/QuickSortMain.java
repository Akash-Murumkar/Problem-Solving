import java.util.Scanner;

class Solution
{
    public static void Sort(int[] unsortArray)
    {
        if (unsortArray.length<=0 ) {
            return; 
        }
        quickSort(unsortArray, 0, unsortArray.length-1);


    }
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    public static int  partition(int[] arr,int low, int high)
    {
        int pivot= arr[low];
        int i=low-1;
        int j= high+1;
        while(true)
        {
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)
            {
                return j;
            }
            swap(arr, i, j);
            //printArray(arr);
        }


    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }


}
public class QuickSortMain
{
    public static void main(String[] args) {
        System.out.println("Enter the number of element to be sort: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] array = new int[n];
        System.out.println("\nEnter the Element of array:");
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.print("\nUnsorted array: { ");
        Solution.printArray(array);
        System.out.print(" }");
        Solution.Sort(array);
        System.out.print("\nSorted array: { ");
        Solution.printArray(array);
        System.out.print(" }");
       
    }

}