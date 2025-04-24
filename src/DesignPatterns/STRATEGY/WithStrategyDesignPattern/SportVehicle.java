package DesignPatterns.STRATEGY.WithStrategyDesignPattern;

import DesignPatterns.STRATEGY.WithStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SportsDriveStrategy());
    }

}
