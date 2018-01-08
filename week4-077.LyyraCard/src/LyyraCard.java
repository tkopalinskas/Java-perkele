
public class LyyraCard {
    private double balance;
    //private double load;
    
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    public String toString(){
        return "The card has " + this.balance + " euros";
    }
    public void payEconomical(){
        if (balance >= 2.50)
        balance = balance - 2.50;
    }
    public void payGourmet(){
        if (balance >= 4)
        balance = balance - 4.00;
    }
    public void loadMoney(double amount){
        //this.load = amount;
        
        if (amount > 0){
        balance = balance + amount;
        
        if (balance > 150)
            balance = 150;
        }
        
    }
    
}
