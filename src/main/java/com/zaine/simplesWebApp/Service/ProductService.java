package com.zaine.simplesWebApp.Service;

import com.zaine.simplesWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 5000000),
            new Product(102, "Iphone2", 4000000));

    public List<Product> getProducts(){
        return  products;
    }
}
