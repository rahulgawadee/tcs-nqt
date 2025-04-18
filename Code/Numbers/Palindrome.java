

public class Palindrome {
    
    public static void isPalindrome(int n ){

        int ReverseNum = 0;
        int duplicate = n;

        while(n>0) {
            int lastDigit = n %10;
            n = n/10;
            ReverseNum = ReverseNum*10 + lastDigit;
        }

        if(ReverseNum == duplicate){
            System.out.println("Is Palindrome!");
        }
        else{
            System.out.println("Not a Palindrome!");
        }
    }
    public static void main(String args[]){

     isPalindrome(424444824);
    }
 
    }

