package designpatterns.observer;

public class Main {
        public static void main(String[] args){
            WeatherStation weatherStation = new WeatherStation();

            WeatherDisplay airportDisplay = new WeatherDisplay();
            WeatherDisplay trainStationDisplay = new WeatherDisplay();

//            weatherStation.registerObserver(airportDisplay);
//            weatherStation.registerObserver(trainStationDisplay);

            weatherStation.setTemperature(25);
            weatherStation.setTemperature(30);
        }

}
