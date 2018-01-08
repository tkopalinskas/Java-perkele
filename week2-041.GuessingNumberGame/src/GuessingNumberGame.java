
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int number;

        // program your solution here. Do not touch the above lines!
        System.out.print("Guess a number: ");
        number = Integer.parseInt(reader.nextLine());
        
        int i = 0;
            
        while (true){
            
            i+=1;
            if (number == numberDrawn){
            System.out.println("Congradulation, your guess is correct!");
            break;
        }
            
            if (number > numberDrawn){
            System.out.println("The number is lesser, guesses made: " + i);
            number = Integer.parseInt(reader.nextLine());
            
        }if (number < numberDrawn){
            System.out.println("The number is greater, guesses made: " + i);
            number = Integer.parseInt(reader.nextLine());
        } if (number == 0 && numberDrawn == 1) {
            System.out.println("The number is greater");
            System.out.println("Congradulations, your guess is correct!");
        
    }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

