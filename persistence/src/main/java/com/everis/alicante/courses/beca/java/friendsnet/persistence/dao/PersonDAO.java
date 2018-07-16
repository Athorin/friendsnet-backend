/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Pakychoko
 *
 */
public interface PersonDAO<Person,Long> extends CrudRepository<Person,Long> {

	public Person relatedPersons(Iterable<Person> people);
}
