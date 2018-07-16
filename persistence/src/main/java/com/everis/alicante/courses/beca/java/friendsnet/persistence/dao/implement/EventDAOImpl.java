/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.implement;

import java.util.Optional;

import javax.persistence.EntityManager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EventDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * @author Pakychoko
 *
 */
public class EventDAOImpl extends AbstractDAO<Event,Long> implements EventDAO<Event,Long>{

	@Override
	public <S extends Event> S save(S event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> Iterable<S> saveAll(Iterable<S> events) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Event> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Event> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Event> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Event> events) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}



}
