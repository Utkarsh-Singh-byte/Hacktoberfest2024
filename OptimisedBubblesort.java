// Optimised Bubble Sort: //

package package4;
import java.util.*;

class Sort2
{
    public static void bubble_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
    }
}

public class OptimisedBubblesort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Sort2.bubble_sort(arr);
        System.out.println("Sorted Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
