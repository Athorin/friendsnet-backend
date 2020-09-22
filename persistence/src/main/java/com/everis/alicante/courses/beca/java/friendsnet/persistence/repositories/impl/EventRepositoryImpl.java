package com.everis.alicante.courses.beca.java.friendsnet.persistence.repositories.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.EventType;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.repositories.EventRepository;

/**
 * Implementacion dedl repositorio custom de eventos
 * @author Pakychoko
 *
 */
//@Repository
public class EventRepositoryImpl implements EventRepository {

	public EntityManager em;
	
	public EventRepositoryImpl(@Qualifier("entitymanagerfactory") EntityManager em) {
		this.em = em;
	}
	
	@Override
	public List<Event> findEventsByParams(Long id, String name, Date startingDate, Date endingDate, EventType type) {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Event> cq = cb.createQuery(Event.class);
		
		// Tabla raiz
		Root<Event> event = cq.from(Event.class);
		// Join se haria anexando el entity con el que se relaciona y el campo relacion en el entity event
		// Join<Event, Person> peopleEvent = event.join("personsOf");
		
		//Lista de predicados
		List<Predicate> predicates = new ArrayList<>();
		
		if(id != null) {
			predicates.add(cb.equal(event.get("id"), id));
		}
		if(StringUtils.isNotBlank(name)) {
			predicates.add(cb.equal(event.get("name"), name));
		}
		if(startingDate != null) {
			predicates.add(cb.lessThanOrEqualTo(event.get("startingDate"), startingDate));
		}
		if(endingDate != null) {
			predicates.add(cb.greaterThanOrEqualTo(event.get("endingDate"), endingDate));
		}
		if(type != null) {
			predicates.add(cb.equal(event.get("type"), type));
		}
		
		cq.where(predicates.toArray(new Predicate[0]));
		
		// Consultamos
		TypedQuery<Event> query = em.createQuery(cq);
		List<Event> eventList = query.getResultList();
		
		return eventList;
	}

}
