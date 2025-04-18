    public class duplicate{
    
        public static int sum(int arr[]) {
        
        int i = 0; 
        for(int j = 0; j<arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
        
        }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,4,5,5,6,6,7,7,8,8,9,9};
        int k = sum(arr);
        for(int i =0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
    }
    
}
