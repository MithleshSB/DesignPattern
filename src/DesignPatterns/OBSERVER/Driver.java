package DesignPatterns.OBSERVER;

/* Observer Design Pattern (Behavioral Pattern)
    When one object changes state, all its dependents are notified automatically.
    Used in event-driven systems, pub-sub models, GUIs. -> “One Talks, Many Listen”
        Subject (Observable): Maintains list of observers, notifies them of changes.
        Observer: Defines update() method to get notified.
        Loosely Coupled: Subject doesn't need to know concrete observer types.
            Real-World Example:
                    YouTube Channel (Subject),Subscribers (Observers) and Weather Station
                    When a new video is uploaded, all subscribers are notified.
 */
public class Driver {

    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        CurrentWeatherConditionDisplay currentWeatherConditionDisplay =
                new CurrentWeatherConditionDisplay(weatherStation);

        AverageTemperatureDisplay averageTemperatureDisplay =
                new AverageTemperatureDisplay(weatherStation);

        weatherStation.parameterChange(20, 10);

        delay();

        weatherStation.parameterChange(30, 20);

        delay();

        weatherStation.parameterChange(5, 15);

    }
}
