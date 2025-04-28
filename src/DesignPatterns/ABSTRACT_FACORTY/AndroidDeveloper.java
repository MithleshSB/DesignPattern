package DesignPatterns.ABSTRACT_FACORTY;

public class AndroidDeveloper implements Employee {
    @Override
    public String name() {
        System.out.println("Android Developer");
        return "I am Android Developer.";
    }

    @Override
    public int salary() {
        return 80000;
    }
}
