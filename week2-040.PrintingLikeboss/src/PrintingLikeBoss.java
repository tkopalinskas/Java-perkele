public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
      
        while (i < amount){
           System.out.print("*");
           i++;
      
        }
           System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
      
        while (i < amount){
           System.out.print(" ");
           i++;
      
        }
           //System.out.println("");
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        //int space = size -1;
        
        while (stars <= size){
        printWhitespaces(size -stars);
        printStars(stars);
        stars++;
       // space--;
        
    }
       
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        //int space = height -1;
        
        while(i<=height){
            
        printWhitespaces(height - i);
        printStars(i*2-1);
            i++;
            //space--;
        
        
        
        
        
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
