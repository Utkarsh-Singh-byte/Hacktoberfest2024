// Binary Search with recursion: without creating an object by using static keyword //
package DSAalgorithm;
import java.util.*;

class B_search_recursion {

    public static int binary_search(int arr[], int left, int right, int data) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (data == arr[mid]) {
            return mid;
        } else if (data > arr[mid]) {
            return binary_search(arr, mid + 1, right, data);
        } else {
            return binary_search(arr, left, mid - 1, data);
        }
    }
}

public class BinarySearch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter the element you want to search:");
        int data=sc.nextInt();

        int index=B_search_recursion.binary_search(arr,0,arr.length-1,data);
        if(index!=-1)
        {
            System.out.println("Element found i.e.: "+data+" "+"at index no.: "+index);
        }
        else
        {
            System.out.println("Elements not found !!");
        }
    }
}
