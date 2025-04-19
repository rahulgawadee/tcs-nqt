public class Average {
    
    public static void average(int arr[]){
        double sum = 0;
        int n = arr.length;

        for(int i =0; i<arr.length;i++){
            sum = sum +arr[i];

        }
        double avg = sum/n;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        average(arr);
    }
}
