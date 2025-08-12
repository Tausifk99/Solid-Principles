package main.single_responsibility_principle.example_invoice;

public class InvoiceRepository {

  public void saveInvoice(String id) {
    System.out.println("Invoice :" + id + " Saved Successfully");
  }
}
