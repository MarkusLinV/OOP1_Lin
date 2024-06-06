package practice.impl;

import java.util.List;

import practice.Product;
import practice.VendingMachine;

public class WaterVendingMachine extends VendingMachine{

    public WaterVendingMachine(){

    }

    public WaterVendingMachine(List<Product> products){
        super(products);
    }
}
