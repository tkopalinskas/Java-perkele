
public class BoundedCounter {
    private int value;
    private int unpperLimit;
    
    public BoundedCounter(int upperLimit)   {
        this.unpperLimit = upperLimit;
       
    }
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        if (value < 0 || value > this.unpperLimit){
            return;
        }
        this.value = value;
        
    }
    
    public void next()  {
        if (value != unpperLimit){
        value++;
        
        }   else    {
        value = 0;
        }
    }
    public String toString()    {
        if (value < 10){
            String man = " 0"+ value;
            return man;
        } else {
        String man =" " + value;
        return man;
    }
}
}
