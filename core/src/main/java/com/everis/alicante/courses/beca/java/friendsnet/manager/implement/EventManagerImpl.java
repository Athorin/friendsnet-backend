/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.Optional;

import com.everis.alicante.courses.beca.java.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * @author Pakychoko
 *
 */
public class EventManagerImpl implements EventManager<Event,Long>{

	@Override
	public <S extends Event> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> Iterable<S> saveAll(Iterable<S> entities) {
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
	public void delete(Event entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Event> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
