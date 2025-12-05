package OPPE_Java.OPPE2_Mock2;

//Input:
//Laptop 32000.0 15
//Smartphone 8000.0 20
//Smartwatch 300.0 12
//TV 100000.0 8
//Output:
//Premium Products with Sufficient Stock:
//Laptop - 32000.0 - In Stock: 15
//Smartphone - 8000.0 - In Stock: 20

import java.util.*;
import java.util.stream.*;

class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String n, double p, int sq) {
        name = n;
        price = p;
        stockQuantity = sq;
    }

    // define method productProcessor
    public static Stream<Product> productProcessor(List<Product> productList) {
        Stream<Product> productStream = productList.stream().filter(s -> s.getPrice() > 5000 && s.getStockQuantity() > 10);
        return productStream;
    }

    public String toString() {
        return name + " - " + price + " - In Stock: " + stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Product product = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
            products.add(product);
        }
        Stream<Product> filteredStream = Product.productProcessor(products);
        System.out.println("Premium Products with Sufficient Stock:");
        filteredStream.forEach(System.out::println);
        sc.close();
    }
}