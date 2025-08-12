package main.open_close_principle;

public class PaypalPayment implements PaymentProcessor {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing Payment using Paypal Method for amount: " + amount);
  }
}
