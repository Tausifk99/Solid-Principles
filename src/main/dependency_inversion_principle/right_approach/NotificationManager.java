package main.dependency_inversion_principle.right_approach;

public class NotificationManager {

  private MessageService messageService;

  public NotificationManager(MessageService messageService) {
    this.messageService = messageService;
  }

  public void send(String to, String message) {
    messageService.sendMessage(to, message);
  }
}
