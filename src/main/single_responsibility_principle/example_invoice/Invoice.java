package main.single_responsibility_principle.example_invoice;

public class Invoice {

  private String id;
  private double amount;

  public Invoice(String id, double amount) {
    this.id = id;
    this.amount = amount;
  }

  public double calculateTotal(double amount) {
    return amount * 0.18 + amount;
  }
}
