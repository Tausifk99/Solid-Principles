package main.open_close_principle;

public class PaymentServiceWithoutOCP {

  public void processPayment(String paymentType) {
    if (paymentType.equals("CREDIT_CARD")) {
      System.out.println("Processing credit card payment");
    } else if (paymentType.equals("PAYPAL")) {
      System.out.println("Processing PayPal payment");
    } else if (paymentType.equals("UPI")) {
      System.out.println("Processing UPI payment");
    }
    // If a new payment method comes, we must edit this method again
  }
}
