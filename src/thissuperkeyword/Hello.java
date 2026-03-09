package thissuperkeyword;
import java.util.*;
public class Hello {
    int a = 10;
}
class Hii extends Hello{
        int a=20;
void show() {
    int a = 30;
    System.out.println(a);

    System.out.println(super.a);
    System.out.println(this.a);
}
public static void main(String[] args){
    Hii h= new Hii();
    h.show();
}
}
