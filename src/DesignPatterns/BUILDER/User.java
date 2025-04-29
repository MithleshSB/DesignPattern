package DesignPatterns.BUILDER;

public class User {
    private String name;
    private int age;
    private String email;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public void display() {
        System.out.println(name + ", " + age + ", " + email);
    }
}
