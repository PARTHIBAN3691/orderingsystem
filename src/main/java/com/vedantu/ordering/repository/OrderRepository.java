package com.vedantu.ordering.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vedantu.ordering.model.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
