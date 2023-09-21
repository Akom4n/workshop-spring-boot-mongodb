package com.akom4n.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akom4n.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text);
}
