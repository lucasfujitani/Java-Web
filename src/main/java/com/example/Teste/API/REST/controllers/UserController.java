package com.example.Teste.API.REST.controllers;

import java.util.List;

import com.example.Teste.API.REST.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Teste.API.REST.entities.User;

@RestController
@RequestMapping(value =  "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {

        List<User> result = repository.findAll();
        return  result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable long id) {

        User result = repository.findById(id).get();
        return  result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {

        User result = repository.save(user);
        return  result;
    }


}
