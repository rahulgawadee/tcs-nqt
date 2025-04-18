import java.util.Scanner;

public class largest {

    public static int larger(int arr[]){
        int large = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > large) {
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest element is : " +larger(arr));
        sc.close();
    }
}
