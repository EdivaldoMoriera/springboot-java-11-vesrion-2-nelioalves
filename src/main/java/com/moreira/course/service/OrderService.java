package com.moreira.course.service;

import java.util.List;
import java.util.Optional;

import com.moreira.course.entities.Order;
import com.moreira.course.repositories.OrderRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class OrderService {
        @Autowired
        private OrderRespository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
            
        }


}

