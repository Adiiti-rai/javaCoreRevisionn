package thissuperkeyword;
import java.util.*;
public class Payment {
    void showPaymentDetails() {
        System.out.println("showing payment details");
    }
}
    class UPIPayment extends Payment {
        void showPaymentDetails() {
            super.showPaymentDetails();
            System.out.println("showing upipayment details");
        }

        public static void main(String[] args) {
            UPIPayment upi = new UPIPayment();
            upi.showPaymentDetails();

        }
    }

    // super refers to the parent class object.it is used in inheritance.
//super keyword can be used in three ways:---------------
// It is used to call parent class 1.method, 2.variable and 3.constructor.

