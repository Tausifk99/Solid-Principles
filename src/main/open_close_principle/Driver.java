package main.open_close_principle;

public class Driver {

  public static void main(String[] args) {
    PaymentService service1 = new PaymentService(new CreditCardPayment());
    service1.makePayment(123345);

    PaymentService service2 = new PaymentService(new PaypalPayment());
    service2.makePayment(564343);
  }
}
