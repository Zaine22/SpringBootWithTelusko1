package com.zaine.simplesWebApp.Model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    public int proId;
    public String proName;
    public int price;

    public Product(){

    }

    public Product(int proId, String proName, int price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }
}
