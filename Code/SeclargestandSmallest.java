
import java.util.*;
public class SeclargestandSmallest {

    public static void secLargeSmall(int arr[]){
        Arrays.sort(arr);

        int secLarge = arr[arr.length - 2];
        int secSmall = arr[1];


       System.out.println("The second largest element is :" + secLarge);
       System.out.println("The second Smallest element is :" + secSmall);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element's : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        secLargeSmall(arr);
        sc.close();
    }
}
