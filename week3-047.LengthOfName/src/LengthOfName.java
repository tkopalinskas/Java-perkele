
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int number = calculateCharacters(name);
        // call your method from here
        System.out.println(number);
        
    }
    
   // do here the method
    public static int calculateCharacters(String name){
        
       int number = name.length();
       return number;
        
    }

    
}
