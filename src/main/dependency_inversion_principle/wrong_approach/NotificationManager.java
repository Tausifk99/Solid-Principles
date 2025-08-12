package main.dependency_inversion_principle.wrong_approach;

public class NotificationManager {

  private EmailService emailService = new EmailService();

  public void send(String to, String message) {  //tightly coupled
    emailService.sendMessage(to, message);
  }
}
