package designpatterns.observer;

/**
 * Created by wenzailong on 2017/11/15.
 */
public class ForecastDisplay implements Observer, DisplayElement{

    private float temperature;
    private float hudimity;
    private Subject weatherData;
    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    /*我们把温度和湿度保存起来*/
    @Override
    public void updare(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.hudimity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay conditions:" + temperature + "F degrees and " + hudimity + "% humidity");
    }
}
