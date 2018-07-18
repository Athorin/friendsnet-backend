/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.java.friendsnet.dto.PostDTO;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PostManager;

/**
 * @author Pakychoko
 *
 */
@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostManager manager;

	@Autowired
	private PersonManager personManager;

	@Autowired
	private DozerBeanMapper mapper;

	@SuppressWarnings("unchecked")
	@GetMapping
	public List<PostDTO> getAll() {
		return (List<PostDTO>) mapper.map(manager.findAll(), PostDTO.class);
	}

	@GetMapping("/{id}")
	public PostDTO getById(@PathVariable("id") Long id) {
		return mapper.map(manager.findById(id), PostDTO.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/person/{id}")
	public Iterable<PostDTO> getByPersonId(@PathVariable("id") Long id) {
		return (Iterable<PostDTO>) mapper.map(personManager.findById(id).getPostsOf(), PostDTO.class);
	}

	@PostMapping
	public PostDTO create(@RequestBody PostDTO post) {
		// return manager.save(post);
		return null;
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		manager.remove(manager.findById(id));
	}
}
