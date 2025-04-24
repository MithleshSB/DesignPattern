package DesignPatterns.STRATEGY.WithStrategyDesignPattern;

import DesignPatterns.STRATEGY.WithStrategyDesignPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
        //super constructor will be called and sports drive strategy object will be assigned.
    }
}
