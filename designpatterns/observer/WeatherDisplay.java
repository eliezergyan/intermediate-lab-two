package designpatterns.observer;

public class WeatherDisplay implements Observer{
    private int temperature;

    @Override
    public void update(int temperature){
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("Current Temperature: " + temperature + "C");
    }
}

