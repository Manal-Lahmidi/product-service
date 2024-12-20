package com.ecommerce.productservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service")
public class ProductRestService {
    @Value("${me}")
    private String me;

    @RequestMapping("/messages")
    public String tellMe() {
        System.out.println("c'est moi qui ai répondu!");
        return me;
    }
}