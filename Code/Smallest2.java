
import java.util.*;
public class Smallest2 {

    public static int Smallest(int arr[]){
        int small = arr[0];

        for(int i =0; i<arr.length; i++) {
            if(arr[i]<small){
                small = arr[0];

            }
        }
        return small;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Element array you want");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Smallest Element in the Array is :" + Smallest(arr));
        sc.close();
    }
}
