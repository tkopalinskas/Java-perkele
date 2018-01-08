
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        
        //int greatest2 = Math.max(number2, number3);
       //int greatest1 = Math.max(number1, number3);
       // int greatest = Math.max(greatest1, greatest2);
       
        int greatest = number1;
        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}