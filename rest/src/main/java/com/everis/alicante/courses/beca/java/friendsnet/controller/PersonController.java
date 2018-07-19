/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.ArrayList;
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

import com.everis.alicante.courses.beca.java.friendsnet.dto.PersonDTO;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * Esto es el controlador de personas, ¡cuidado, puedo controlarte!
 * 
 * @author Pakychoko
 * 
 */
@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonManager manager;

	@Autowired
	private DozerBeanMapper mapper;

	@SuppressWarnings("unchecked")
	@GetMapping
	public List<PersonDTO> getAll() {
		List<PersonDTO> myList = new ArrayList<PersonDTO>();
		for (Person p : manager.findAll()) {
			myList.add(mapper.map(p, PersonDTO.class));
		}
		return myList;
	}

	@GetMapping("/{id}")
	public PersonDTO getById(@PathVariable("id") Long id) {
		return mapper.map(manager.findById(id), PersonDTO.class);
	}

	@PostMapping
	public PersonDTO create(@RequestBody PersonDTO person) {
		return mapper.map(manager.save(mapper.map(person, Person.class)), PersonDTO.class);
	}

	@PostMapping("/{id}/relate")
	public PersonDTO relate(@PathVariable("id") Long id, List<PersonDTO> people) {
		// return mapper.map(manager.relatePersons(manager.findById(id), people),
		// PersonDTO.class);
		return null;
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		manager.remove(manager.findById(id));
	}
}
