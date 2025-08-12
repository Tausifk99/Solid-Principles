package main.open_close_principle;

public class UPIPayment implements PaymentProcessor {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing Payment using UPI method for amount: " + amount);
  }
}
