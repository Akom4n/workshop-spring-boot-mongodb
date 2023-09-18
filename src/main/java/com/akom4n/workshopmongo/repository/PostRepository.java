package com.akom4n.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akom4n.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
