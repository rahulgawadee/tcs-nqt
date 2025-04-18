// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Sum {
    
    public static void natural(int n ){
        
        int sum = 0;
        for(int i = 1; i<=n;i++) {
            sum = sum + i;
        
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        natural(6);
    }
}