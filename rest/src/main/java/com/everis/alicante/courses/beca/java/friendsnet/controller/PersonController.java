/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
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
	
	public Person getById(Long id) {
		return null;
	}
	
	public Person create(Person person) {
		return null;
	}
	
	public Person relate(String s, List<String> l) {
		return null;
	}
	
	public void remove(Long id) {
		
	}
}
