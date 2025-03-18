import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String a = sc.nextLine().toLowerCase();
        System.out.println("Enter second string:");
        String b = sc.nextLine().toLowerCase();  

        if (a.length() != b.length()) {
            System.out.println("false");
        } else {
            
            char[] arr1= a.toCharArray();
            char[] arr2= b.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            System.out.println(Arrays.equals(arr1, arr2) ? "true" : "false");
        }

        sc.close();
    }
}