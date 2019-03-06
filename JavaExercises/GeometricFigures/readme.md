# Inheritance in Java

## Concepts
- Inheritance.
- Abstract classes.
- Arrays of objects.
- Variable-length arrays.

## SOLID Principles
- These principles guide the agile design of your application:
- `SRP` **(S)** or *Single Responsibility Principle*: a class should only have a reason to change.
- `OCP` **(O)** or *Open / Closed Principle*: software entities (classes, modules, functions, etc.) should be open to their extension but 
closed to their modification.
- `LSP` **(L)** or *Principle of substitution of Liskov*: the objects of a program should be replaceable by instances of their base 
types without altering the correct functioning of the program (inheritance and polymorphism).

## Exercise
Design a program that uses the mechanism of Inheritance in Object Oriented Programming, which allows to carry out the following operations:
1. Write a program that creates objects of the geometric figures that are proposed next. 
2. Add them to an array. 
3. Scroll through it showing the name of the figure and the area of all of them in the console the objects included in it.

## Tasks
1. Define a `Circle` class to instantiate objects of this geometric figure, which allows to calculate its area from its radius.
2. Define a `Rectangle` class to instantiate objects of this geometric figure, which allows to calculate its area from its sides.
3. Write a program that stores objects of type `Circle` and `Rectangle` in an `Array`.
    - The program instantiates objects of type Circle and type Rectangle, defines its properties, and adds them to an Array.
    - Next, it shows on screen the name and area of all the figures stored in the array.
4. Now define a `Square` class to instantiate objects of this geometric figure, which allows you to calculate its area from its sides. 
To add this new type to your program and keep it working correctly, *you should not modify the code you have already written* (the classes 
and the main program), *but only extend it with new instructions*. This is the principle of agile software development called *Open / Closed 
Principle* **(OCP)**: software entities (classes, modules, functions, etc.) should be open to their extension but closed to their modification.
    - If you come to the conclusion that you need to modify the code of the program to include the square type and be able to calculate 
    your area, try to make a *new design to anticipate the inclusion of new types of geometric figures*, allowing you to add them without 
    the need to alter the code, *but simply extend it with new classes*.
    - To verify that the new design you have made is correct, now add a new class to instantiate `Ellipse` objects. Instance this object 
    in the main program, add it to the array of figures and visualize its area next to the rest of the objects in the array.
