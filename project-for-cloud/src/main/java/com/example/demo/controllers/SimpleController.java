package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleController {


    private ProductsRepository productsRepository;

    public SimpleController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }


    @GetMapping("/hello")
    public List<Products> hello(){
        return productsRepository.findAll();
    }


    @GetMapping("/")
    public String all(){
        return "Bu yerga hamma kirolidi";
    }

}
