package thissuperkeyword;
// this--> this refers to the current object of the current class.
// there are three ways to use this keyword:
// 1. to refer current class instance variable.
// 2. to invoke current class method.
// 3. to invoke current class constructor.
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

//this keyword refers to current class object.
//It is used for:
//1️. Accessing current class variables → this.variable
//2️. Calling current class methods → this.method()
//3️. Calling current class constructors → this()
