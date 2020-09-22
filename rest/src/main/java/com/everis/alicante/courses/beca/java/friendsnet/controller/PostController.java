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
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * Controlador de Posts
 * @author Pakychoko
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

	/**
	 * Servicio que consulta todos los Posts
	 * @return List<PostDTO>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping
	public List<PostDTO> getAll() {
		return (List<PostDTO>) mapper.map(manager.findAll(), PostDTO.class);
	}

	/**
	 * Servicio que consulta un Post por Id
	 * @param id
	 * @return PostDTO
	 */
	@GetMapping("/{id}")
	public PostDTO getById(@PathVariable("id") Long id) {
		return mapper.map(manager.findById(id), PostDTO.class);
	}

	/**
	 * Servicio que consulta la lista de Posts de una persona por su Id
	 * @param id
	 * @return Iterable<PostDTO>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping("/person/{id}")
	public Iterable<PostDTO> getByPersonId(@PathVariable("id") Long id) {
		return (Iterable<PostDTO>) mapper.map(personManager.findById(id).getPostsOf(), PostDTO.class);
	}

	/**
	 * Servicio que crea un post
	 * @param post
	 * @return PostDTO
	 */
	@PostMapping
	public PostDTO create(@RequestBody PostDTO post) {
		return mapper.map(manager.save(mapper.map(post, Post.class)), PostDTO.class);
	}

	/**
	 * Servicio que borra un post por su Id
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		manager.remove(manager.findById(id));
	}
}
