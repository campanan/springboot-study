package com.projetodeestudo.springstudy.repositories;

import com.projetodeestudo.springstudy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
