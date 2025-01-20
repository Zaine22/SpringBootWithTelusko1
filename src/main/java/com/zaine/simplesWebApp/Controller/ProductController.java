package com.zaine.simplesWebApp.Controller;

import com.zaine.simplesWebApp.Model.Product;
import com.zaine.simplesWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service ;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/productName")
    public String getName(){
        return service.getProductName();
    }
    @GetMapping("products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
}
