package main.open_close_principle;

public class CreditCardPayment implements PaymentProcessor {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing Payment Using CreditCard Method for amount :" + amount);
  }
}
