/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public interface GroupManager<Group,Long> extends Manager<Group,Long>{

	public Group addPersons(Iterable<Person> group);
}
