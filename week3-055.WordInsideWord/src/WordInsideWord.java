
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        System.out.println("Type the second word: ");
        String partS = reader.nextLine();
        int index = word.indexOf(partS);
        
        if (index >=0){
            System.out.println("The word '" + partS + "' is found in the word '" + word + "."); 
        } else {
            System.out.println("The word '" + partS + "' is not found in the word '" + word + ".");
        }
        
        
        
                
    }
}
