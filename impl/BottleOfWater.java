package practice.impl;

import java.time.LocalDate;

import practice.Product;

public class BottleOfWater extends Product {

    private float volume;
    private String pack;
    private boolean isSpark;


    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = EPackage.PLASTIS.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }
    
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}