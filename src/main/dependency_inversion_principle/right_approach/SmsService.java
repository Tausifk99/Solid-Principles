package main.dependency_inversion_principle.right_approach;

public class SmsService implements MessageService {

  @Override
  public void sendMessage(String to, String message) {
    System.out.println("Sending Message to : " + to + " and message is " + message);
  }
}
