package main.single_responsibility_principle.example_invoice;

public class InvoicePrinter {

  public void printInvoice(String id, double amount) {
    System.out.println("Invoice ID is :" + id + " and Amount is :" + amount);
  }
}
