import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        
        int sum = 0;
        for (int number : list){
        sum += number ;
        }
        
        return sum;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (sum(list)*1.0)/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        
        double addition = 0;
        for (double number : list) {
            addition += (Math.pow(number - average(list)*1.0, 2));
            
        }
        double variance = (addition*1.0) /(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
