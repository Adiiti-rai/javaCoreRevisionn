package polymorphism.epam.com.compiletimepolymorphism;

public class AreaCalculation {
    //circle
    double calculateArea(int r){
        return r*r;
    }
    //Rectangle
    double calculateArea(int l,int b){
        return l*b;
    }
    public static void main(String[]args){
        AreaCalculation a1= new AreaCalculation();
        System.out.println(a1.calculateArea(4));
        System.out.println(a1.calculateArea(2,4));
    }
}
