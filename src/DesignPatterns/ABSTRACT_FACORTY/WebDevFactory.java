package DesignPatterns.ABSTRACT_FACORTY;

public class WebDevFactory extends Employee_abstract_factory{
    @Override
    public Employee creatEmployee() {
        return new WebDeveloper();
    }
}
