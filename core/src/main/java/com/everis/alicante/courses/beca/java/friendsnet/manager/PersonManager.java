/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public interface PersonManager extends Manager<Person,Long> {

	public Person relatePersons(Person person, Iterable<Person> persons);
}
