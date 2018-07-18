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

import com.everis.alicante.courses.beca.java.friendsnet.dto.GroupDTO;
import com.everis.alicante.courses.beca.java.friendsnet.dto.PersonDTO;
import com.everis.alicante.courses.beca.java.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;

/**
 * @author Pakychoko
 *
 */
@RestController
@RequestMapping("/group")
public class GroupController {

	@Autowired
	private GroupManager manager;

	@Autowired
	private PersonManager personManager;

	@Autowired
	private DozerBeanMapper mapper;

	@SuppressWarnings("unchecked")
	@GetMapping
	public List<GroupDTO> getAll() {
		return (List<GroupDTO>) mapper.map(manager.findAll(), GroupDTO.class);
	}

	@GetMapping("/{id}")
	public GroupDTO getById(@PathVariable("id") Long id) {
		return mapper.map(manager.findById(id), GroupDTO.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/person/{id}")
	public Iterable<GroupDTO> getByPersonId(@PathVariable("id") Long id) {
		return (Iterable<GroupDTO>) mapper.map(personManager.findById(id).getGroupsOf(), GroupDTO.class);
	}

	@PostMapping
	public GroupDTO create(@RequestBody GroupDTO group) {
		// return mapper.map(manager.save(group), GroupDTO.class);
		return null;
	}

	@PostMapping("/{id}/relate")
	public GroupDTO relate(@PathVariable("id") Long id, List<PersonDTO> personGroup) {
		// return mapper.map(manager.addPersons(id, personGroup), GroupDTO.class) ;
		return null;
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		manager.remove(manager.findById(id));
	}
}
