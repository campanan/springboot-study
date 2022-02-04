package com.projetodeestudo.springstudy.repositories;

import com.projetodeestudo.springstudy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
