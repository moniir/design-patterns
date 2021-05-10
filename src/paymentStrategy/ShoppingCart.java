package paymentStrategy;

import paymentStrategy.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList;

    public ShoppingCart(){
        productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        if(productList.isEmpty()){
            return;
        }
        productList.remove(product);
    }
    public int calculatePrice(){
        int sum = 0;
        for(Product productItem : productList){
            sum += productItem.getPrice();
        }
        return sum;
    }
    public void pay(Payment paymentStrategy){
        int price = calculatePrice();
        paymentStrategy.pay(price);
    }
}
