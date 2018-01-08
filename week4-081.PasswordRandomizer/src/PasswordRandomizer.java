import java.util.Random;

public class PasswordRandomizer {
    
    private Random random = new Random();
    

    public PasswordRandomizer(int length) {
        String password = "";
        for(int i = 0; i<length; i++){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt((int)this.random.nextInt(26));
            
            
        }
        
    }

    public String createPassword() {
        
        return ;
    }
}
