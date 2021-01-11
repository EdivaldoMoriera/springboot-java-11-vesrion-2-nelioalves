package com.moreira.course.repositories;

import com.moreira.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Long>{
    
}
