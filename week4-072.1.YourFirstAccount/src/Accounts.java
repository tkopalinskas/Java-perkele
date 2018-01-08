
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account tomasAccount = new Account ("Tomo account" , 100);
        System.out.println(tomasAccount);
        tomasAccount.deposit (20);
        System.out.println(tomasAccount);
        //System.out.print("Tomo Account balance is " + tomasAccount.balance());
    }

}
