package com.projetodeestudo.springstudy.resources;

import com.projetodeestudo.springstudy.entities.Category;
import com.projetodeestudo.springstudy.entities.Product;
import com.projetodeestudo.springstudy.services.CategoryService;
import com.projetodeestudo.springstudy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/products")
public class ProductResource {

    @Autowired
    private ProductService service;


    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
