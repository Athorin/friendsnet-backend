/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PostManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
public class PostController {

	@Autowired
	private PostManager manager;
	
	@Autowired
	private PersonManager personManager;
	
	
	@GetMapping("/post")
	public List<Post> getAll(){
		return (List<Post>) manager.findAll();
	}
	
	@GetMapping("/post/{id}")
	public Post getById(Long id) {
		return manager.findById(id);
	}
	
	@GetMapping("/post/person/{id}")
	public Iterable<Post> getByPersonId(Long id) {
		return personManager.findById(id).getPostsOf();
	}	
	
	@PostMapping("/post")
	public Post create(Post post) {
		return manager.save(post);
	}
	
	@DeleteMapping("/post/{id}")
	public void remove(Long id) {
		manager.remove(manager.findById(id));
	}
}
