package singletondesignpattern;

public class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo() {
        System.out.println("object created");
    }
    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }
    public static void main(String[] args){
        SingletonDemo s1= SingletonDemo.getInstance();
        System.out.println(" first call");
        SingletonDemo s2= SingletonDemo.getInstance();
        System.out.println("second call");
        System.out.println(s1==s2);
    }
}


