package DesignPatterns.STRATEGY.WithStrategyDesignPattern;

import DesignPatterns.STRATEGY.WithStrategyDesignPattern.Strategy.DriveStrategy;

public class XYZDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("XYZ Drive Capability.");
    }
}
