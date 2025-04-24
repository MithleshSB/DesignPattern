package DesignPatterns.OBSERVER;

public class AverageTemperatureDisplay implements Observer {
    private int sumOfTemperature;
    private int totalTemperature;

    public AverageTemperatureDisplay(Observable observable) {
        totalTemperature = 0;
        sumOfTemperature = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperature += temperature;
        totalTemperature++;
        display();
    }

    private void display() {
        System.out.println("Average record of Temperature : " + totalTemperature + ",records : " + sumOfTemperature);
    }
}
