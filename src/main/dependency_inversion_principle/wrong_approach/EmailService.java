package main.dependency_inversion_principle.wrong_approach;

public class EmailService {

  void sendMessage(String to, String message) {
    System.out.println("Sending Email to: " + to + " and message is: " + message);
  }
}
