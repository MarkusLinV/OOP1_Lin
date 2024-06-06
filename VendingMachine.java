package practice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private List<Product> products = new ArrayList<Product>();

    public VendingMachine(){
        this.products = new ArrayList<>();
    }
    
    public VendingMachine (List<Product> products){
        this.products = products;
    }

    protected void addProducts (List<Product> products){// бывший initProducts
        this.products.addAll(products);
    }

    public List<Product> getProduct() {
        return products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            System.out.println(1);
            if(product.getName().equals(name)){
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        throw new RuntimeException("No such product: " + name);//если выше продукт не был найден, то выдаст ошибку, продукт не найден
    }

}
