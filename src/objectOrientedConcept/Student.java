//OOPS-> OOPS stands for object Oriented Programming Language.
//OOPS is a programming approach where we design the programs using classes and Objects.

//Class-> Class is a bluePrint.It is user defined dataType which defines its properties and functions.
//eg:- Human being is a class and the body parts of a human being
// are its properties and the action performed
//by the body parts are known as function.
//------------------------------------------------------------------------
//Object-> Object is an instance of class. It's real time entity.


package objectOrientedConcept;
import java.util.*;
public class Student {
    String name;
    int id;
    int rollNo;
    String department;
    static  int add(int x,int y) {
        return (x + y);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        int id= sc.nextInt();
        int rollNo= sc.nextInt();
        sc.nextLine();
        String department= sc.nextLine();
        int x= sc.nextInt();
        int y= sc.nextInt();
        int sum= add(x,y);
        System.out.println(name);
        System.out.println(id);
        System.out.println(rollNo);
        System.out.println(department);
        System.out.println(sum);
    }
}
