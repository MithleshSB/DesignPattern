package DesignPatterns.FACTORY;

public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("Android developer")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("web developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }

    }
}
