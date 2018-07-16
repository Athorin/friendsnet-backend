/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public interface GroupDAO<Person,Long> extends EntityDAO<Person,Long> {

	public Group addPersons(Iterable<Person> person);
}
