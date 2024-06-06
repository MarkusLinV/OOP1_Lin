package practice.impl;

import java.time.LocalDate;

import practice.Product;

public class HotDrink extends Product{

    private float volume;
    private int temperature;

    public HotDrink(String name, double price, LocalDate releaseDate, float volume, int temperature) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", temperature=" + temperature + '}';
    }
    
}