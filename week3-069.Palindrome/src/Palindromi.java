import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        
        int reverse = text.length() - 1;
        int i = 0;
        String back = ("");
        
        if(text.isEmpty()){
            return true;
        }
         while (reverse >= 0 && i <= text.length()-1){
            
            char compare = text.charAt(reverse);
            reverse--;
            i++;
            back += compare;
            
       if (back.equals(text) || text.isEmpty())
            return true;
        } 
     
     
    return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
