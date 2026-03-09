package thissuperkeyword;
//in this we call the constructor of the parent class using super keyword
public class App {
    App(){
        System.out.println("This is the parents constructor");
    }
}
class MobileApp extends App{
    MobileApp(){
        super();
        System.out.println("This is the child constructor");
        //super();
    }

    public static void main(String[] args){
        MobileApp m= new MobileApp();


    }
}

