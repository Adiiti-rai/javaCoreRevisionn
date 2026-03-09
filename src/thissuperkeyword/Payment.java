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

