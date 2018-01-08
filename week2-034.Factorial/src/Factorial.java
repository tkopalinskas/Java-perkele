import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = 1;
       
        int last;
        int factorial = 1;
        
        System.out.println("Type a number: ");
        last = Integer.parseInt(reader.nextLine());
        
        while (number<= last){
            
            factorial = factorial * number;
            number++;
          }
               System.out.println(factorial);

    }
}
