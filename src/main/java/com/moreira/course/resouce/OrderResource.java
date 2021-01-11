package com.moreira.course.resouce;

import java.util.List;

import com.moreira.course.entities.Order;
import com.moreira.course.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class OrderResource {


@RestController
@RequestMapping(value = "/orders")
public class UserResource {
    //
    @Autowired
    private OrderService service;

    //retorna todos os usuarios
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){

        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    //retorna ususario por id
    @GetMapping(value="/{id}")
    public ResponseEntity <Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    }
   
}
