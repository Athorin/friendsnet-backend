/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;

/**
 * @author Pakychoko
 *
 */
public interface PersonManager<Person,Long> extends Manager<Person,Long> {

	public Person relatePersons(Iterable<Person> persons);
}
