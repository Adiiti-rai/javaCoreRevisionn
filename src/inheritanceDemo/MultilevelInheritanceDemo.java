package inheritanceDemo;


class GrandFather {
    void eat() {
        System.out.println("grandFather is eating");
    }
}

class Father extends GrandFather {
    void drink() {
        System.out.println("Father is drinking");
    }
}

class child extends Father {
    void sleep() {
        System.out.println("child  is sleeping");
    }
}


public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        child obj = new child();
        obj.eat();
        obj.drink();
        obj.sleep();
    }
}

