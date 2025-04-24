package DesignPatterns.DACORATOR;

public class ExtraMayoBurger extends Burger {
    private Burger burger;

    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with Extra Mayo.";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 20;
    }
}
