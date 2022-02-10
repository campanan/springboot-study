package com.projetodeestudo.springstudy.repositories;

import com.projetodeestudo.springstudy.entities.OrderItem;
import com.projetodeestudo.springstudy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
