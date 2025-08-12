package main.dependency_inversion_principle.right_approach;

public class EmailService implements MessageService {

  @Override
  public void sendMessage(String to, String message) {
    System.out.println("Sending Email to : " + to + " and message is : " + message);
  }
}
