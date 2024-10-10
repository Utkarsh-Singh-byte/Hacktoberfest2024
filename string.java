package practice1;
import java.util.Scanner;

class StringReverse {
    public static void reverse(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine(); // Read the entire line

        char[] str = input.toCharArray(); // Convert the string to a character array

        StringReverse.reverse(str); // Reverse the character array

        System.out.println("Reversed string is:");
        System.out.println(new String(str)); // Convert the reversed character array back to a string

        sc.close(); // Close the scanner
    }
}
