package com.moreira.course.config;

import java.time.Instant;
import java.util.Arrays;

import com.moreira.course.entities.Order;
import com.moreira.course.entities.User;
import com.moreira.course.entities.enums.OrderStatus;
import com.moreira.course.repositories.OrderRespository;
import com.moreira.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRespository orderRespository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.DELIVERED, u1);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRespository.saveAll(Arrays.asList(o1, o2, o3));
    }
    
}
