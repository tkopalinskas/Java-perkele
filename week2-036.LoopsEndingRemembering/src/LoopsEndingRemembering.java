import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int times = 0;
        double average;
        int odd =0;
        int even =0;
        
        System.out.println("Type numbers:");
        
        while(true){{
            number = Integer.parseInt(reader.nextLine());
       } if (number == -1){
            
                 break;
       }
           sum += number;
                
            times++; 
             
         if (number%2==0) {
                even += 1;
        } if (number%2==1){
                odd += 1;
        
      
              }
        }

        //sum +=1;
       // times+=-1;
        average = (sum)*1.0/(times) ;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " +sum);
        System.out.println("How many numbers: " + times);
        System.out.println("Average: " + average);
        System.out.println("Even numbers:" + even);
        System.out.println("Odd numbers: " + odd);
        }
        
    }


    
//
