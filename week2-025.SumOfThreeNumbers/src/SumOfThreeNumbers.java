
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        //int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        System.out.println("Type the first number: ");
        int readOne = Integer.parseInt(reader.nextLine());
      
        System.out.println("Type the second number: ");
        
        int readTwo = Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        int readTre = Integer.parseInt(reader.nextLine());
       
      
        sum = readOne + readTwo + readTre;
        System.out.println("Sum: " + sum);
    }
}
//System.out.print("Type the first number: ");
      //  read = Integer.parseInt(reader.nextLine());
     //   sum = sum + read;
 
      //  System.out.print("Type the second number: ");
      //  read = Integer.parseInt(reader.nextLine());
       // sum = sum + read;
 
       // System.out.print("Type the third number: ");
       // read = Integer.parseInt(reader.nextLine());
      //  sum = sum + read;