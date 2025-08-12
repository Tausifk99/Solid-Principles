package main.dependency_inversion_principle.right_approach;

public class Driver {

  public static void main(String[] args) {
    NotificationManager notificationManager1 = new NotificationManager(new EmailService());
    notificationManager1.send("test@gmail.com", "Hello, This Message is for EMAIL");

    NotificationManager notificationManager2 = new NotificationManager(new SmsService());
    notificationManager2.send("9822435634","Hello, This message is for SMS");
  }
}
