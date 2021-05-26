package com.company.strategy.paymentStrategy;

import com.company.strategy.paymentStrategy.domain.Product;

public class Main {

    public static void main(String[] args){
        Product product = new Product(10,"abc");
        Product productOne = new Product(20,"def");
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product);
        shoppingCart.addProduct(productOne);

        System.out.println("Payment: ");
        shoppingCart.pay(new PaypalAlgorithm("monir@gmail.com","abc"));
        shoppingCart.pay(new CreditCardAlgorithm("43214700*******1","BBL"));

    }
}
