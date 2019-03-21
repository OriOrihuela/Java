# 5th SOLID Principle
### In this exercise you have a *"complicated"* project to improve according to the principle of `Dependency Inversion`.

This project manages a set of stores, each with its inventory. The critical part of the application is an algorithm that we have invented that determines when it is necessary to replace a product in a store.

1. In `src` there are two packages, `org.lasencinas.negocio`, with the business rules that are going to make millionaires, and `org.lasencinas.bbdd`, with the technical code we need to access to the database.

2. Currently, there is a dependency of the business package, to the bbdd package, since the `StockController`
needs to know what is the current stock in a store, and this is done by `InventoryBBDD`.

**Your work:**
- Make the business package have **no dependency** on the bbdd package. Create an interface in business that captures what is needed from the inventory logic and make `StockController` express itself with this interface.
Done this change, the test must work without changing anything!
