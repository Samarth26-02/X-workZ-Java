// WeatherStationDetails.java
package Assesments10;

public class WeatherStationDetails extends WeatherStation {
    @Override
    public void readTemperature() {
        System.out.println("Reading detailed temperature");
    }

    @Override
    public void readHumidity() {
        System.out.println("Reading detailed humidity");
    }

    @Override
    public void readWindSpeed() {
        System.out.println("Reading detailed wind speed");
    }

    @Override
    public void readPressure() {
        System.out.println("Reading detailed atmospheric pressure");
    }

    @Override
    public void displayForecast() {
        System.out.println("Displaying detailed weather forecast");
    }
}