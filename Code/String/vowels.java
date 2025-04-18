package String;

public class vowels {
    public static void main(String[] args) {
        String s = "Hello World";
        int cons = 0, vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   
            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                vowels++;
            } else if ((c >= 'a' && c <= 'z')) {
                cons++;
            }
        }
        System.out.println("Number of vowels are: " + vowels);
        System.out.println("Number of consonants are: " + cons);
    }
}
