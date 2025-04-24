package DesignPatterns.STRATEGY.WithStrategyDesignPattern;

import DesignPatterns.STRATEGY.WithStrategyDesignPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
