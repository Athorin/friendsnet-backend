package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * Interfaz del manager de personas
 * @author Pakychoko
 */
public interface PersonManager extends Manager<Person,Long> {

	/**
	 * Metodo que relaciona una persona con una lista de personas
	 * @param person
	 * @param persons
	 * @return Person
	 */
	public Person relatePersons(Person person, Iterable<Person> persons);
}
