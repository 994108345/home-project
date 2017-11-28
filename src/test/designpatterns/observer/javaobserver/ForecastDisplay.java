package designpatterns.observer.javaobserver;

import java.util.Observable;

/**
 * Created by wenzailong on 2017/11/15.
 */
public class ForecastDisplay implements java.util.Observer, designpatterns.observer.DisplayElement {

    Observable observerable;
    private float temperature;
    private float hudimity;
    public ForecastDisplay(Observable observerable){
        this.observerable = observerable;
        observerable.addObserver(this);
    }
    /*我们把温度和湿度保存起来*/
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.hudimity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay conditions:" + temperature + "F degrees and " + hudimity + "% humidity");
    }
}
