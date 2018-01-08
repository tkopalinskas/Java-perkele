
public class Multiplier {
    private int number;
    
    public Multiplier (int numberAtStart){
        this.number = numberAtStart;
    }
    
    public int multiply (int otherNumber){
        int multiply = number * otherNumber;
        return multiply;
    }
}
