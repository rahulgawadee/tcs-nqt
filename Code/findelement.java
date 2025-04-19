public class findelement {
    public static void search(int arr[]){

        int element = 8;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                System.out.print(i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,6};
        search(arr);
    }
   
}
