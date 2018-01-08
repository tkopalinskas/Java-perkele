
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.println("until what?");
        int number = Integer.parseInt(reader.nextLine());
        while(i <= number) {
        sum +=  i;
        i++;
    }
        System.out.println(sum); //gryst prie sito

    }
}
