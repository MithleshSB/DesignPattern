package DesignPatterns.STRATEGY.WithStrategyDesignPattern;

/*   STRATEGY PATTERN
 * The Strategy Design Pattern is all about giving you choices for how something
 * should work—and making it easy to switch between those choices.
 * Imagine giving different ways to select:
 *
 * without -> If parent class does not have some capability and child classes are driving their own
 * and suppose many child classes driving the same method/capability which will lead to the duplicate
 * in larger amounts.(Child having same code/functionality which base doesn't.)
 *
 * With -> created the basic interface and can implement any type of functionality we require
 * which will help in reusing the code rather duplicating.
 * So, if we ever want to add a new funtionality method we can implement the "blueprint"
 * without changing the main code.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, This is Strategy Design Pattern");
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
        vehicle = new PassengerVehicle();
        vehicle.drive();
    }
}