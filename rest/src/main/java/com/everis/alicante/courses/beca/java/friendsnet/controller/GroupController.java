/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.everis.alicante.courses.beca.java.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public class GroupController {

	@Autowired
	private GroupManager manager;

	@Autowired
	private PersonManager personManager;
	
	
	@GetMapping("/group")
	public List<Group> getAll(){
		return (List<Group>) manager.findAll();
	}
	
	@GetMapping("/group/{id}")
	public Group getById(Long id) {
		return manager.findById(id);
	}
	
	@GetMapping("/group/person/{id}")
	public Iterable<Group> getByPersonId(Long id) {
		 return personManager.findById(id).getGroupsOf();
	}	
	
	@PostMapping("/group")
	public Group create(Group group) {
		return manager.save(group);
	}

	@PostMapping("/group/{id}/relate")
	public Group relate(Long id, List<Person> personGroup) {
		return manager.addPersons(manager.findById(id), personGroup);
	}
	
	@DeleteMapping("/group/{id}")
	public void remove(Long id) {
		
	}
}
