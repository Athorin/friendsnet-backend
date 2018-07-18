/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public interface PersonDAO extends CrudRepository<Person, Long> {

	//public Person relatedPersons(Person person, Iterable<Person> people);
}
