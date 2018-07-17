/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public interface GroupManager extends Manager<Group,Long>{

	public Group addPersons(Group group, Iterable<Person> people);
}
