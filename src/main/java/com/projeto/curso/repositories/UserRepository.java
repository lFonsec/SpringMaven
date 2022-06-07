package com.projeto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.curso.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
