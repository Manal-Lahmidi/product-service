package com.ecommerce.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DummyDataCLR implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Pencil", "Book", "Eraser").forEach(name -> productRepository.save(new Product(name)));
        productRepository.findAll().forEach(product -> System.out.println(product.getName()));
    }
}
