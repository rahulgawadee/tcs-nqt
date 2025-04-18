import java.util.Scanner;

public class leapYear {
     public static boolean isleap(int n) {
        
        if(n%4 == 0){
            return true;
        }
        if(n%400 == 0){
            return true;
        }
        if(n%100 == 0){
            return false;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year :");
        int n = sc.nextInt();
        
        System.out.print(isleap(2000));
        sc.close();
        
    }
}
