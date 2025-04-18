import java.util.Arrays;

public class freqcount {
    public static void main(String[] args) {
        int arr[] = {1,1, 2,2, 3, 4, 5, 6};
        Arrays.sort(arr);   // Ensure the array is sorted
        
        int count = 1;      //Bydefault let it be 1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i-1] + " appears " + count + " times");
                count = 1; // Reset count for the new number
            }
        }
        // Print the last element count
        System.out.println(arr[arr.length-1] + " appears "  +count + " times");
        
    }
}
