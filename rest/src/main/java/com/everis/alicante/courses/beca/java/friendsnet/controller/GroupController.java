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

import com.everis.alicante.courses.beca.java.friendsnet.dto.GroupDTO;
import com.everis.alicante.courses.beca.java.friendsnet.dto.PersonDTO;
import com.everis.alicante.courses.beca.java.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * Controlador de Grupos
 * @author Pakychoko
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

	/**
	 * Servicio que consulta todos los grupos
	 * @return List<GroupDTO>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping
	public List<GroupDTO> getAll() {
		return (List<GroupDTO>) mapper.map(manager.findAll(), GroupDTO.class);
	}

	/**
	 * Servicio que consulta un grupo por su Id
	 * @param id
	 * @return GroupDTO
	 */
	@GetMapping("/{id}")
	public GroupDTO getById(@PathVariable("id") Long id) {
		return mapper.map(manager.findById(id), GroupDTO.class);
	}

	/**
	 * Servicio que consulta los grupos de una persona por su Id
	 * @param id
	 * @return Iterable<GroupDTO>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping("/person/{id}")
	public Iterable<GroupDTO> getByPersonId(@PathVariable("id") Long id) {
		return (Iterable<GroupDTO>) mapper.map(personManager.findById(id).getGroupsOf(), GroupDTO.class);
	}

	/**
	 * Servicio que da de alta un grupo
	 * @param group
	 * @return GroupDTO
	 */
	@PostMapping
	public GroupDTO create(@RequestBody GroupDTO group) {
		return mapper.map(manager.save(mapper.map(group, Group.class)), GroupDTO.class);
	}

	/**
	 * Servicio que relaciona una lista de personas con un grupo
	 * @param id
	 * @param personGroup
	 * @return GroupDTO
	 */
	@PostMapping("/{id}/relate")
	public GroupDTO relate(@PathVariable("id") Long id, @RequestBody List<PersonDTO> personGroup) {
		
		List<Person> myList = new ArrayList<Person>();
		
		for(PersonDTO p: personGroup) {
			myList.add(mapper.map(p, Person.class));
		}
		Group g = manager.addPersons(id, myList);
		personGroup.clear();
		
		for(Person p: myList) {
			personGroup.add(mapper.map(p, PersonDTO.class));
		}
		
		return mapper.map(g, GroupDTO.class);
	}

	/**
	 * Servicio que da de baja un grupo
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		manager.remove(manager.findById(id));
	}
}
