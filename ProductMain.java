package practice;

import java.time.LocalDate;
import java.util.List;

import practice.impl.BottleOfWater;
import practice.impl.EPackage;
import practice.impl.HotDrink;
import practice.impl.HotDrinkVendingMachine;
import practice.impl.WaterVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        // Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));
        // Product bottle2 = new BottleOfWater("Родники Газированная", 55,
        // LocalDate.of(2024, 5, 1), true, EPackage.CLASS.getMaterial(),
        // 0.5F);

        // VendingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());

        // vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2,
        // bottle2));

        // // System.out.println(vm.getProduct());
        // System.out.println(vm.getProduct("Родники"));

        // // System.out.println(vm.getProduct());

        HotDrink coffy1 = new HotDrink("Американо", 10, LocalDate.of(2020, 06, 5), 0.4f, 105);
        HotDrink coffy2 = new HotDrink("Капучиноно", 10, LocalDate.of(2020, 06, 5), 0.2f, 100);
        HotDrink coffy3 = new HotDrink("Латте", 10, LocalDate.of(2020, 06, 5), 0.3f, 95);

        HotDrinkVendingMachine HdVm = new HotDrinkVendingMachine();

        HdVm.addProductsH(List.of(coffy1, coffy2, coffy3));

        System.out.println(HdVm.getProducts());

        // System.out.println(HdVm.getProduct("Латте"));

        System.out.println(HdVm.getProduct("Латте", 0.3f, 95));

    }
}