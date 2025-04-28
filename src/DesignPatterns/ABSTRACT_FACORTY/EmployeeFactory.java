package DesignPatterns.ABSTRACT_FACORTY;

public class EmployeeFactory {
    //get employee
    public static Employee getEmployee(Employee_abstract_factory aef) {
        return aef.creatEmployee();
    }
}
