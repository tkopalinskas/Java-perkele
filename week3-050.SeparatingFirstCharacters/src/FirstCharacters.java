import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 1;
        
        while (i<=3 && !(name.length() <=2)){
        char character = name.charAt(i - 1);
            System.out.println(i + ". character: " + character);
            i++;
            
       
        
        
            
        }
        
    }
    
}
