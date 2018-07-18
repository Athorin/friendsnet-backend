/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PersonManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PersonDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
@Service
public class PersonManagerImpl implements PersonManager{

	@Autowired
	private PersonDAO dao;

	@Override
	public Iterable<Person> findAll() {
		return dao.findAll();
	}

	@Override
	public Person findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public Person save(Person person) {
		return dao.save(person);		
	}

	@Override
	public Iterable<Person> save(Iterable<Person> people) {
		return dao.saveAll(people);
	}

	@Override
	public Person update(Person person) {
		return dao.save(person);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> people) {
		return dao.saveAll(people);
	}

	@Override
	public void remove(Person person) {
		dao.delete(person);
	}

	@Override
	public Person relatePersons(Person person, Iterable<Person> people) {
		return null;
	}
	


}
