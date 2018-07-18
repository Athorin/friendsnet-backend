/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.java.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EventDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PersonDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
@Service
public class EventManagerImpl implements EventManager{

	@Autowired
	private EventDAO dao;
	
	@Autowired
	private PersonDAO pDao;

	@Override
	public Iterable<Event> findAll() {

		return dao.findAll();
	}

	@Override
	public Event findById(Long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public Event save(Event event) {
		
		return dao.save(event);
	}

	@Override
	public Iterable<Event> save(Iterable<Event> events) {
		
		return dao.saveAll(events);	
	}

	@Override
	public Event update(Event event) {
		
		return dao.save(event);
	}

	@Override
	public Iterable<Event> update(Iterable<Event> events) {
		
		return dao.saveAll(events);
	}

	@Override
	public void remove(Event event) {
		
		dao.delete(event);
	}
	

	public Event addPerson(Long id_person, Long id_event) {
		Person person = pDao.findById(id_person).get();
		Event event = dao.findById(id_event).get();
		event.getPersonsOf().add(person);
		return event;
	}


}
