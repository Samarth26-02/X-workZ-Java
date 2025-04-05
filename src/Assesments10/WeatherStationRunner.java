// WeatherStationRunner.java
package Assesments10;

public class WeatherStationRunner {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.readTemperature();
        station.readHumidity();
        station.readWindSpeed();
        station.readPressure();
        station.displayForecast();

        System.out.println("----------------------");

        WeatherStation station1 = new WeatherStationDetails();
        station1.displayForecast();
        station1.readPressure();
        station1.readWindSpeed();
        station1.readHumidity();
        station1.readTemperature();

        System.out.println("----------------------");

        WeatherStationDetails stationDetails = new WeatherStationDetails();
        stationDetails.readTemperature();
        stationDetails.displayForecast();
        stationDetails.readPressure();
        stationDetails.readWindSpeed();
        stationDetails.readHumidity();
    }
}