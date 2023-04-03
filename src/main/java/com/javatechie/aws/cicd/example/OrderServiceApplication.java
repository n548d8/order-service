package com.javatechie.aws.cicd.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class OrderServiceApplication {

    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrders() {
    	// sorted​(Comparator<? super T> comparator)	
    	// Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
    	// comparing​(Function<? super T,​? extends U> keyExtractor)	
    	// Accepts a function that extracts a Comparable sort key from a type T, and returns a Comparator<T> that compares by that sort key.
        return orderDao.getOrders().stream().
                sorted(Comparator.comparing(Order::getName)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
