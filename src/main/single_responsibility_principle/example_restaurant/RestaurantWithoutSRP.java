package main.single_responsibility_principle.example_restaurant;

public class RestaurantWithoutSRP {

  //Waiter Takes Order
  public String takeOrder() {
    return "pizza";
  }

  //Create Order
  public String createOrder(String order) {
    return order;
  }

  //Take Payment
  public void takeBill(int amount) {
    System.out.println("Bill of " + amount + " Paid Successfully");
  }
}
