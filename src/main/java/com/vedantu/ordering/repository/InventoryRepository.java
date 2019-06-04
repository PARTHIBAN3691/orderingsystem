package com.vedantu.ordering.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vedantu.ordering.model.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String>{

}
