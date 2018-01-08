
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       
        int numberOne;
        int numberTwo;
        int sum = 0;
        System.out.println("First: ");
        numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        numberTwo = Integer.parseInt(reader.nextLine());
        
        
        
        while (numberOne <= numberTwo){
            sum += numberOne;
            numberOne++;
        }
        System.out.println("The sum is " + sum);
    }
}
