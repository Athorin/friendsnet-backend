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
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * Esto es el controlador de personas, ¡cuidado, puedo controlarte!
 * @author Pakychoko
 * 
 */
public class PersonController {

	@Autowired
	private PersonManager manager;
	
	
	@GetMapping("/person")
	public List<Person> getAll(){
		return (List<Person>) manager.findAll();
	}
	
	@GetMapping("/person{id}")
	public Person getById(Long id) {
		return manager.findById(id);
	}
	
	@PostMapping("/person")
	public Person create(Person person) {
		return manager.save(person);
	}
	
	@PostMapping("/person/{id}/relate")
	public Person relate(Long id, List<Person> people) {
		return manager.relatePersons(manager.findById(id), people);
	}
	
	@DeleteMapping("/person/{id}")
	public void remove(Long id) {
		
	}
}
