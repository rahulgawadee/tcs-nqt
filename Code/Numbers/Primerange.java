// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Primerange {
    public static boolean isPrime(int n ){
        for(int i = 2; i<n; i++){
            if(n%i == 0) {
                return false;
            }   
        }
        return true;
    }
    public static void main(String[] args) {
        
        int n = 15;
        for(int i = 1; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    
  
    }
}