/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.Optional;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;

/**
 * @author Pakychoko
 *
 */
public class PersonManagerImpl<Person,Long> implements PersonManager<Person,Long>{

	@Override
	public <S extends Person> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Person> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> findAllById(Iterable<Long> ids) {
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
	public void delete(Person entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Person> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person relatePersons(Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

}
