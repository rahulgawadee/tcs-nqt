
import java.util.*;
    public class sumArray {
        public static int sum(int arr[]) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of array :");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
      
        for(int i =0; i<arr.length; i++) {
              System.out.print("Enter the elements in the array element no." + i + " :");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The sum of an array is : " + sum(arr));
        sc.close();
    }
    
}