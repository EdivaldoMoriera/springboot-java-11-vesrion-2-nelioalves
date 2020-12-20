package com.moreira.course.resouce;

import java.util.List;

import com.moreira.course.entities.User;
import com.moreira.course.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
    //
    @Autowired
    private UserService service;

    //retorna todos os usuarios
    @GetMapping
    public ResponseEntity<List<User>> findAll(){

        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    //retorna ususario por id
    @GetMapping(value="/{id}")
    public ResponseEntity <User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    }
    
