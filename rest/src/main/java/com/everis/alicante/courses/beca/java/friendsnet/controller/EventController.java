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

import com.everis.alicante.courses.beca.java.friendsnet.dto.EventDTO;
import com.everis.alicante.courses.beca.java.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * Controlador de Eventos
 * @author Pakychoko
 *
 */
@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventManager manager;

	@Autowired
	private PersonManager personManager;

	@Autowired
	private DozerBeanMapper mapper;

	/**
	 * Servicio que consulta todos los eventos
	 * @return List<EventDTO>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping
	public List<EventDTO> getAll() {
		return (List<EventDTO>) mapper.map(manager.findAll(), EventDTO.class);
	}

	/**
	 * Servicio que consulta un evento por su Id
	 * @param id
	 * @return EventDTO
	 */
	@GetMapping("/{id}")
	public EventDTO getById(@PathVariable("id") Long id) {
		return mapper.map(manager.findById(id), EventDTO.class);
	}

	/**
	 * Servicio que consulta los eventos de una persona por su Id
	 * @param id_person
	 * @return List<EventDTO>
	 */
	@SuppressWarnings("unchecked")
	@GetMapping("/person/{id}")
	public List<EventDTO> getByPersonId(@PathVariable("id") Long id_person) {
		return (List<EventDTO>) mapper.map(personManager.findById(id_person).getEventsOf(), EventDTO.class);
	}

	/**
	 * Servicio que da de alta una persona en el evento por sus Id
	 * @param id_person
	 * @param id_event
	 * @return EventDTO
	 */
	@PostMapping("/{id_event}/person/{id_person}/add")
	public EventDTO addPerson(@PathVariable("id_person") Long id_person, @PathVariable("id_event") Long id_event) {
		return mapper.map(manager.addPerson(id_person, id_event), EventDTO.class);
	}

	/**
	 * Servicio que da de alta un evento
	 * @param event
	 * @return EventDTO
	 */
	@PostMapping
	public EventDTO create(@RequestBody EventDTO event) {
		return mapper.map(manager.save(mapper.map(event,Event.class)), EventDTO.class) ;
	}

	/**
	 * Servicio que da de baja un evento
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void remove(@PathVariable("id") Long id) {
		manager.remove(manager.findById(id));
	}
}
