package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * Interfaz del manager de eventos
 * @author Pakychoko
 */
public interface EventManager extends Manager<Event,Long> {

	/**
	 * Metodo que da de alta una persona en un evento
	 * @param person
	 * @param event
	 * @return Event
	 */
	public Event addPerson(Long person, Long event);
}
