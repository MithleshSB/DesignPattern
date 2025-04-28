package DesignPatterns.ABSTRACT_FACORTY;
/*  Abstract Factory Design Pattern
 Factory of Factories — creates families of related objects without specifying their concrete classes.
    Mnemonic:"Factory of Factories"
Key Concepts:
        Abstract Factory: Interface to create related products (families).
        Concrete Factory: Implements abstract factory to produce concrete products.
        Products: Concrete classes that belong to a product family.
Real-World Analogy:
            Furniture Factory → produces Chair + Sofa
            Modern Factory → ModernChair + ModernSofa

“Abstract Factory provides an interface for creating families of related objects without
specifying their concrete classes — promoting consistency and scalability.”

*/
public class Driver {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee.name();

        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee2.name();
    }
}
