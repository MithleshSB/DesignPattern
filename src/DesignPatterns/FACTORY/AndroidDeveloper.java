package DesignPatterns.FACTORY;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Android Developer");
        return 80000;
    }
}
