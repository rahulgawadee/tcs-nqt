public class repeatingnoelements {
    public static void repeating(int arr[]){
        
        int count = 0;
        
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[]args ){
        int arr[] = {1,1,2,4,5,6,6,7,7};
        repeating(arr);
    }
}