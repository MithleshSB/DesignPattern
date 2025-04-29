package DesignPatterns.BUILDER;
/*  Builder Design Pattern (Creational Pattern)
    Intent: "To build complex objects step-by-step without directly calling a constructor."
    Mnemonic: “Step-by-step construction of an object with custom config.”
Why Use Builder?
    Avoid telescoping constructors (too many overloaded constructors).
    Improves readability and immutability. Often used in POJOs, DTOs, and fluent APIs.

    “Builder pattern helps create complex objects in a readable and controlled way by
    separating object construction from representation.”
 */
public class Driver {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();
        User user = builder.setName("Mithlesh")
                .setAge(25)
                .setEmail("mithlesh@example.com")
                .build();

        user.display();
    }
}
