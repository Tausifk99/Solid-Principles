* What is Solid Principles?
-> Solid Principles is the principles to which is use to write a good and clean code for maintainability.

* Problem without SP?
1-Maintainability issue (Complexity increases when new features introduced and very less scope for modification)
2-Readability issue (Difficult to explain the code to another developer)
3-Bugs

SOLID Stands for :-
S->Single Responsibility Principle(SRP)
O->Open-Close Principle(OCP)
L->Liskov Substitution Principle(LSP)
I->Interface Segregation Principle(ISP)
D->Dependency Inversion Principle(DIP)

* Single Responsibility Principle
->A class should have only one responsibility and do only one thing.

Example :-
1- Think of a restaurant:

The Chef cooks food.
The Waiter takes orders and serves customers.
The Cashier handles billing.

If one person did all three, it would be messy.
Each role has one clear responsibility.

2-Invoicing
This Invoice class has 3 responsibilities:
Business logic (calculateTotal())
Persistence (saveToDatabase())
Presentation (printInvoice())

If the way we save to DB changes, we must change this class. If printing changes, again we must change this class.

* Open-Close Principle
->Open For Extension and Close for modification

* Liskov Substitution Principle
1.If S is a subtype of T, then objects of type T should be replaceable with objects of type S without breaking the program.
2.In simpler terms: Subclasses should behave in a way that doesn’t surprise or break the expectations of the parent class.
->If you have code that works with a parent type, you should be able to pass in any child type without your code breaking or behaving unexpectedly.

* Interface Segregation Principle
->don’t make one giant interface that everyone has to implement, split it into smaller, specific ones.
  
* Problem:

1.Local Disk storage has no concept of presigned URLs or region replication, but is forced to implement them anyway.
2.Google Cloud might not support the same replication method as AWS.
3.This leads to empty method bodies, fake implementations, or throwing UnsupportedOperationException — all bad for maintainability.

* Dependency Inversion Principle
->High-level modules should not depend on low-level modules. Both should depend on abstractions.
  Abstractions should not depend on details; details should depend on abstractions.

* Problem:
1.NotificationManager is a high-level module (managing notifications).
2.EmailService is a low-level module (specific way of sending).
3.If tomorrow you need to send SMS or Push Notifications, you must modify NotificationManager — breaking the Open/Closed Principle too.

