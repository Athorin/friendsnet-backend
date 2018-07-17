/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;


import org.springframework.beans.factory.annotation.Autowired;

import com.everis.alicante.courses.beca.java.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EventDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * @author Pakychoko
 *
 */
public class EventManagerImpl implements EventManager{

	@Autowired
	private EventDAO<Event,Long> dao;

	@Override
	public Iterable<Event> findAll() {

		return dao.findAll();
	}

	@Override
	public Event findById(Long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void save(Event event) {
		
		dao.save(event);
	}

	@Override
	public void save(Iterable<Event> events) {
		
		dao.saveAll(events);	
	}

	@Override
	public void update(Event event) {
		
		dao.save(event);
	}

	@Override
	public void update(Iterable<Event> events) {
		
		dao.saveAll(events);
	}

	@Override
	public void remove(Event event) {
		
		dao.delete(event);
	}
	



}
