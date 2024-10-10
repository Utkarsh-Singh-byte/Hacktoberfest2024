package DSAalgorithm;

import java.util.Scanner;
import java.util.Random;

class QuickSort1{

    private static Random random = new Random();

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr, int lb, int ub) {
        // Use the element at the upper bound as the pivot
        int pivot = arr[ub];
        int start = lb - 1; // Position of the smaller element

        for (int i = lb; i < ub; i++) { // Loop from lb to ub - 1
            if (arr[i] <= pivot) { // If current element is smaller than or equal to pivot
                start++;
                swap(arr, start, i); // Swap elements
            }
        }
        // Swap pivot element to its correct position
        swap(arr, start + 1, ub);
        return start + 1; // Return the partition point
    }

    // Method to randomly select a pivot and move it to the end
    private static void randomizePivot(int[] arr, int lb, int ub) {
        int randomIndex = lb + random.nextInt(ub - lb + 1);
        swap(arr, randomIndex, ub); // Move the random pivot to the end
    }

    public static void random_quick_sort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            randomizePivot(arr, lb, ub); // Randomly select and move pivot to end
            int loc = partition(arr, lb, ub); // Partition around the pivot
            random_quick_sort(arr, lb, loc - 1); // Recursively sort the left part
            random_quick_sort(arr, loc + 1, ub); // Recursively sort the right part
        }
    }
}

public class RandomisedQuickSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort1.random_quick_sort(arr, 0, size - 1);
        System.out.println("Sorted Array is:");
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}
