package com.everis.alicante.courses.beca.java.friendsnet.utils;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * Clase que genera objetos necesarios para las pruebas
 * @author Pakychoko
 *
 */
public class MockitoFactory {

	/**
	 * Crea un objeto iterable con una lista de eventos
	 * @return Iterable<Event>
	 */
	public static Iterable<Event> getIterableEvents() {
		List<Event> eventList = new ArrayList<>();
		Event e = new Event();
		e.setId(1L);
		eventList.add(e);
		
		return (Iterable<Event>) eventList;
	}
}
