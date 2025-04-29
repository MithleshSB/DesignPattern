package DesignPatterns.PROTOTYPE;

public class Student implements Prototype{
    String name;
    private int rollNumber;
    String subject;

    public Student() {
    }

    public Student(String name, int rollNumber, String subject) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
    }

    @Override
    public Prototype clone() {
        return new Student(name,rollNumber,subject);
    }
}
