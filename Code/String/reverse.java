package String;

public class reverse {
    public static void main(String args[]){
        String s = "GS SG";
        
        char[] arr = s.toCharArray();

        for(int i = arr.length -1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
