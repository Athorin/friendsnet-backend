/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author Pakychoko
 *
 */
public interface EventManager extends Manager<Event,Long> {

	public Event addPerson(Person person, Event event);
}
