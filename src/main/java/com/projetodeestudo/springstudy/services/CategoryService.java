package com.projetodeestudo.springstudy.services;

import com.projetodeestudo.springstudy.entities.Category;
import com.projetodeestudo.springstudy.entities.User;
import com.projetodeestudo.springstudy.repositories.CategoryRepository;
import com.projetodeestudo.springstudy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }


}
