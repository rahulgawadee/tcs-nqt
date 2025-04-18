
public class Prime {
    
    public static boolean isPrime(int n ){

        int count = 0;
        for(int i = 1; i<=n; i++){
        if(n%i == 0){
            count++;
        }
    }
        if(count == 2){
           return true;
        }
        else{
           return false;
        }
    }
    public static void main(String[] args) {
       boolean a =  isPrime(4);

       if(a == true){
        System.out.println("Yes");
       }
       else{
        System.out.println("No");
       }

    }
}
