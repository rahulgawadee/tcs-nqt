
public class EvenOdd {
    public static boolean evenOdd(int n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean a = evenOdd(6);
        if(a == true){
            System.out.println("Its even");
        }
        else{
            System.out.println("Its odd");
        }
    }
}
