/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kepal
 */
public class Product {
    private String name;
    private int amount;
    private double price;
    
    public Product (String nameAtStart, double priceAtStart, int amountAtStart){
        this.price = priceAtStart;
        this.amount = amountAtStart;
        this.name = nameAtStart;
               
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
           
    
}
