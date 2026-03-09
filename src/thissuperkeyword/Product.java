package thissuperkeyword;
// this--> this refers to the current object of the current class.
import java.util.*;
public class Product {
    int productId;
    String productName;
    double price;

    //constructor
    Product(int productId, String productName, double price){
        this.productId= productId;
        this.productName= productName;
        this.price= price;
    }
    void display(){
        System.out.println("productId:"+ productId);
        System.out.println("productName:"+productName);
        System.out.println("price:"+price);
    }
    public static void main(String[]args){
        Product p1= new Product(1001,"Laptop", 50000);
        p1.display();

    }

}
