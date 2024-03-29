package com.scaler.productservice.controllers;

import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id)
    {
        return productService.getSingleProduct(id);
    }

    @PostMapping()
    public Product addNewProduct(@RequestBody Product product)
    {
        Product p =new Product();
        p.setTitle("A new product");
        return new Product();
    }

    @PatchMapping("/{id}")
    public Product updateAProduct(@PathVariable("id") Long id, @RequestBody Product product)
    {
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceAProduct(@PathVariable("id") Long id, @RequestBody Product product)
    {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id)
    {
        return;
    }

}
