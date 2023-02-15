package com.haichao.day2.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observes;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observes = new ArrayList();
    }
    @Override
    public void registerObserver(Observer observer) {
        observes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observes.indexOf(observer);
        if(i>=0){
            observes.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o :
                observes) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void messurementChanged() {
        notifyObservers();
    }

    public void setMessurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementChanged();
    }

    public float getTemperature(){
        return (float)0.3;
    }

    public float getHumidity() {
        return (float)0.6;
    }

    public float getPressure(){
        return (float)0.8;
    }
}
