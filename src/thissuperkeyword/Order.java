package thissuperkeyword;
import java.util.*;
public class Order {
    void show(){
        System.out.println("showing the order");
    }
    void process(){
        this.show();
        System.out.println("processing the order");
    }
    public static void main(String[] args){
        Order o= new Order();
        o.process();
    }
}
// using this keyword to call current class method.