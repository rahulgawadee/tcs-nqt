package String;
public class plaindrome {

        public static void main(String args[]){
            String s = "madam";
    
            
         // Using toCharArray to copy elements
            char[] arr = s.toCharArray();
            String res = "";
    
           
            for(int i = arr.length -1; i>=0; i--) {
                res = res + arr[i];
            }
            System.out.println(res);
            if(res.equals(s)){
                System.out.println("hOGAYA bHAI");
            }
            else{
                System.out.println("Nope");
            }
            
    
        }
    }
    
    
