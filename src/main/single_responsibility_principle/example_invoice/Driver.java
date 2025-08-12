package main.single_responsibility_principle.example_invoice;

public class Driver {

  public static void main(String[] args) {
    String id = "IN0293ML4";
    double amount = 20000;
    Invoice invoice = new Invoice(id, amount);
    double totalAmount = invoice.calculateTotal(amount);
    InvoicePrinter printer = new InvoicePrinter();
    InvoiceRepository invoiceRepository = new InvoiceRepository();
    invoiceRepository.saveInvoice(id);
    printer.printInvoice(id, totalAmount);
  }
}
