package DesignPatterns.ABSTRACT_FACORTY;

public class WebDeveloper implements Employee {

    @Override
    public String name() {
        System.out.println("Web Developer");
        return "I am Web Developer";
    }

    @Override
    public int salary() {
        return 150000;
    }
}
