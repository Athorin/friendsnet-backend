/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.everis.alicante.courses.beca.java.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * @author Pakychoko
 *
 */
public class EventController {

	@Autowired
	private EventManager manager;
	
	@Autowired
	private PersonManager personManager;
	
	@GetMapping("/event")
	public List<Event> getAll(){
		return (List<Event>) manager.findAll();
	}
	
	@GetMapping("/event/{id}")
	public Event getById(Long id) {
		return manager.findById(id);
	}
	
	@GetMapping("/event/person/{id}")
	public List<Event> getByPersonId(Long id_person){
		return personManager.findById(id_person).getEventsOf();
	}
	
	@PostMapping("/event/{id_event}/person/{id_person}/add")
	public Event addPerson(Long id_person, Long id_event) {
		return manager.addPerson(personManager.findById(id_person),manager.findById(id_event));
	}
	
	@PostMapping("/event")
	public Event create(Event event) {
		return manager.save(event);
	}
	
	@DeleteMapping("event/{id}")
	public void remove(Long id) {
		manager.remove(manager.findById(id));
	}
}
