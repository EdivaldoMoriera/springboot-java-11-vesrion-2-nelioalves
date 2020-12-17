package com.moreira.course.resouce;

import com.moreira.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Pedro","Pedro@hotmail.com", "88263653", "Moreira@01");
        return ResponseEntity.ok().body(user);
    }
    
}