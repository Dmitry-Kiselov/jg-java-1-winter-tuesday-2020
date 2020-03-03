package l7;

import java.math.BigDecimal;

public class ShoppingCart {

    public static void main(String[] args) {

        Product[] products = new Product[20];

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product("Product " + i, new BigDecimal(i));
        }

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product);
        }

        for (Product product : products) {
            System.out.println(product);
        }

    }

}
