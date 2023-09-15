package com.akom4n.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akom4n.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
