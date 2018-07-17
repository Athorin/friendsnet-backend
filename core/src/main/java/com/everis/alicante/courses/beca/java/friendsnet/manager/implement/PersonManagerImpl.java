/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;


import org.springframework.beans.factory.annotation.Autowired;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PersonDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public class PersonManagerImpl implements PersonManager{

	@Autowired
	private PersonDAO<Person, Long> dao;

	@Override
	public Iterable<Person> findAll() {
		return dao.findAll();
	}

	@Override
	public Person findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void save(Person person) {
		dao.save(person);		
	}

	@Override
	public void save(Iterable<Person> people) {
		dao.saveAll(people);
	}

	@Override
	public void update(Person person) {
		dao.save(person);
	}

	@Override
	public void update(Iterable<Person> people) {
		dao.saveAll(people);
	}

	@Override
	public void remove(Person person) {
		dao.delete(person);
	}

	@Override
	public Person relatePersons(Iterable<Person> people) {
		return dao.relatedPersons(people);
	}
	


}
