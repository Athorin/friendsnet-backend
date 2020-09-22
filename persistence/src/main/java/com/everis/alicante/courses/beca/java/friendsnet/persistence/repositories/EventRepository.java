package com.everis.alicante.courses.beca.java.friendsnet.persistence.repositories;

import java.util.Date;
import java.util.List;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.EventType;

/**
 * Interfaz del repositorio custom de eventos
 * @author Pakychoko
 *
 */
public interface EventRepository {

	/**
	 * Metodo criteria builder de consulta de eventos
	 * 
	 * @param id
	 * @param name
	 * @param startingDate
	 * @param endingDate
	 * @param type
	 * @return List<Event>
	 */
	List<Event> findEventsByParams(Long id, String name, Date startingDate, Date endingDate, EventType type);
}
