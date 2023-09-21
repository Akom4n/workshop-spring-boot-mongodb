package com.akom4n.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akom4n.workshopmongo.domain.Post;
import com.akom4n.workshopmongo.domain.User;
import com.akom4n.workshopmongo.exception.ObjectNotFoundException;
import com.akom4n.workshopmongo.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public List<Post> findAll() {
		return repo.findAll();
	}
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
