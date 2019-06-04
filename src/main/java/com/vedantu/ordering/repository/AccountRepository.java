package com.vedantu.ordering.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vedantu.ordering.model.Account;

public interface AccountRepository extends MongoRepository<Account, String>{

}
