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

