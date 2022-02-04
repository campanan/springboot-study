package com.projetodeestudo.springstudy.services;

import com.projetodeestudo.springstudy.entities.Order;
import com.projetodeestudo.springstudy.entities.User;
import com.projetodeestudo.springstudy.repositories.OrderRepository;
import com.projetodeestudo.springstudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }


}
