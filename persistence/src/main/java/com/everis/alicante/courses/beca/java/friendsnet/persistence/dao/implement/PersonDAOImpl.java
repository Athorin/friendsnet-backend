/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.implement;

import java.util.Optional;

import javax.persistence.EntityManager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PersonDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author paco_
 *
 */
public class PersonDAOImpl extends AbstractDAO<Person,Long> implements PersonDAO<Person,Long> {

	@Override
	public <S extends Person> S save(S person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Person> Iterable<S> saveAll(Iterable<S> people) {
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
	public void delete(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Person> people) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person relatedPersons(Iterable<Person> people) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
