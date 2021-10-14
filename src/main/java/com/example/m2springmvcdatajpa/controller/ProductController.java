package com.example.m2springmvcdatajpa.controller;

import com.example.m2springmvcdatajpa.entities.Product;
import com.example.m2springmvcdatajpa.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {


    ProductRepository productRepository;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Método para meter datos de prueba y hacer pruebas
    @GetMapping ("/products/data")
    public String data () {
        Product product1 = new Product(null, "Producto 1", 9.95);
        Product product2 = new Product(null, "Producto 2", 19.95);
        Product product3 = new Product(null, "Producto 3", 29.95);
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        return "redirect:/products";
    }


    @GetMapping ("/products")
    public String findAll (Model model) {
        // 1. Recuperar los productos de la base de datos
        List<Product> products = productRepository.findAll();

        // 2. Cargar los productos en el model
        model.addAttribute("products",products);

        // 3. Movernos a la vista
        return "product-list";
    }
}
