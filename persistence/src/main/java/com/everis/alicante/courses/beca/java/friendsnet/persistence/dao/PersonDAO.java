/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

/**
 * @author Pakychoko
 *
 */
public interface PersonDAO<Person,Long> extends EntityDAO<Person,Long> {

	public Person relatedPersons(Iterable<Person> people);
}
