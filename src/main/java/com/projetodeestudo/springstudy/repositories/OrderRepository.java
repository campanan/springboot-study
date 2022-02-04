package com.projetodeestudo.springstudy.repositories;

import com.projetodeestudo.springstudy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
