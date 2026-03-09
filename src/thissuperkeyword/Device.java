package thissuperkeyword;
import java.util.*;
public class Device {
    Device(){
        this(1001);
        System.out.println("Print the default constructor");
    }
    Device(int id){
        System.out.println("Print the parameterized constructor with id:"+id);
    }
    public static void main(String[] args){
        Device d= new Device();
    }
}
//this used to call Current Class Constructor (Constructor Chaining).

// Constructor chaining:-this() is used to call another constructor of the same class.
// This is called constructor chaining and it must be the first statement in the constructor.