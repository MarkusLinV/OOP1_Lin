package practice.impl;

import java.util.ArrayList;
import java.util.List;

import practice.VendingMachine;

public class HotDrinkVendingMachine extends VendingMachine {

    private List<HotDrink> Products = new ArrayList<HotDrink>();

    public HotDrinkVendingMachine() {
        this.Products = new ArrayList<>();
    }

    public HotDrinkVendingMachine(List<HotDrink> products) {
        super();
    }

    public void addProductsH(List<HotDrink> Products) {
        this.Products.addAll(Products);
    }

    public List<HotDrink> getProducts() {
        return Products;
    }

    public HotDrink getProduct(String name, float volume, int temperature) {
        for (HotDrink product : Products) {
            if (product.getName().equals(name)) {
                if (product.getVolume() == volume) {
                    if (product.getTemperature() == temperature) {
                        return product;
                    }
                }
            }
        }
        throw new RuntimeException("Совпадений нет");
    }
}