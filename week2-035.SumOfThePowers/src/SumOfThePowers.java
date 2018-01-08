
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number =2;
        int last;
        int times = 0;
        
        int result = 0;
       
        
        System.out.println("Type a number: ");
        last = Integer.parseInt(reader.nextLine());
        
       
        
        while (times <= last){
          result += (int) Math.pow(number, times) ;
            
            times++;
            
          
        }
                   
        System.out.println("The result is "+ result);
        

    }
}
