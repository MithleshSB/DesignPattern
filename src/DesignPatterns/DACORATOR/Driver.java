package DesignPatterns.DACORATOR;
/*
Decorator Design Pattern
Purpose:
    To add or modify responsibilities (behavior) of an object at runtime(runtime Polymorphism), without changing its code.
The Problem It Solves:
    If you keep extending a class with new functionality via inheritance, it leads to:
    Class explosion (too many subclasses),Tight coupling
How It Works:
    You define a base interface (e.g., Coffee).
    Create a concrete implementation (e.g., SimpleCoffee).
    Then, create decorator classes that also implement the base interface and wrap the original object.
    Each decorator adds its own behavior, either before or after calling the wrapped object’s method.
Coffee coffee = new SimpleCoffee();      // Base object (5.0)
coffee = new Milk(coffee);              // Adds 1.5 (Total = 6.5)
coffee = new Sugar(coffee);             // Adds 0.5 (Total = 7.0)
Every time you wrap the object with a new decorator, you’re layering functionality,
just like adding toppings to a pizza.
You need to add responsibilities to individual objects dynamically, not entire classes.
“Decorator is preferred when you want flexibility in extending behavior at runtime without altering existing code,
 following the Open/Closed Principle.”

*/
public class Driver {
    public static void main(String[] args) {
        //We only want Zinger burger without any topings.
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription() + "," + burger.getCost());

        // we want to add Extra cheese
        burger = new ExtraCheeseBurger(burger);
        System.out.println(burger.getDescription() + "," + burger.getCost());

        // we want to add extra Mayo
        burger = new ExtraMayoBurger(burger);
        System.out.println(burger.getDescription() + "," + burger.getCost());

    }
}
