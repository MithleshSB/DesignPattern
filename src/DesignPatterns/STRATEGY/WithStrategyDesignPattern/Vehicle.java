package DesignPatterns.STRATEGY.WithStrategyDesignPattern;

import DesignPatterns.STRATEGY.WithStrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    // this is constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void  drive(){
        driveStrategy.drive();
    }
}
