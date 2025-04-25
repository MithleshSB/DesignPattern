package DesignPatterns.FACTORY;
/*  Factory Design Pattern (Creational Pattern)
    Used to create objects without exposing the instantiation logic to the client.
    Instead of new, you use a factory method to get the object.
    Mnemonic:   “Don’t ‘new’ it — let the Factory do it!”
Key Concepts:
    Problem: Tight coupling to specific classes using new.
    Solution: Create objects through a factory method that decides which class to instantiate.
Use Factory Pattern: When object creation is complex or dependent on logic/conditions
                       When you want to hide implementation classes
                        When you want to follow Open/Closed Principle — easily add new types
Real-Life Use Cases:
    Calendar.getInstance(), Logger.getLogger(),
    JDBC: DriverManager.getConnection(), Spring: ApplicationContext.getBean()

“Factory Pattern abstracts the object creation process.
It lets the subclass or method decide which object to create,
promoting loose coupling and easier code maintenance and runtime object creation.”

*/
public class Driver {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmployee("android developer");
        int salary1 = emp1.salary();
        System.out.println("SALARY " + salary1);
        Employee emp2 = EmployeeFactory.getEmployee("web developer");
        int salary2 = emp2.salary();
        System.out.println("SALARY " + salary2);
        Employee emp3 = EmployeeFactory.getEmployee(" designer");
        if (emp3 == null) {
            System.out.println("Wrong selection");
        }
    }
}
