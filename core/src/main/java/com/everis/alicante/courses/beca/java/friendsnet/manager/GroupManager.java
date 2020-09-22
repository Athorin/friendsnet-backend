package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * Interfaz del manager de grupos
 * @author Pakychoko
 *
 */
public interface GroupManager extends Manager<Group,Long>{

	/**
	 * Metodo que da de alta una lista de personas en un grupo
	 * @param id
	 * @param people
	 * @return Group
	 */
	public Group addPersons(Long id, Iterable<Person> people);
}
