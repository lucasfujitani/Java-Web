package com.example.Teste.API.REST.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Teste.API.REST.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
}
