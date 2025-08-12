package main.single_responsibility_principle.example_invoice;

public class InvoiceWithoutSRP {

  private String id;
  private double amount;

  public double calculateTotal(double amount) {
    return amount * 0.18 + amount;
  }

  public void saveInvoice(String id) {
    System.out.println("Invoice :" + id + " Saved Successfully");
  }

  public void printInvoice(String id, double amount) {
    System.out.println("Invoice ID is :" + id + " and Amount is :" + amount);
  }
}
