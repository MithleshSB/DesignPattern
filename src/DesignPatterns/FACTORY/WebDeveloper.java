package DesignPatterns.FACTORY;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Web Developer");
        return 150000;
    }
}
