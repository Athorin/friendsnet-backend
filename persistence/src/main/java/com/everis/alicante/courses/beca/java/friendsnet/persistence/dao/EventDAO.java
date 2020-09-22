package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

/**
 * Repositorio de Eventos
 * @author Pakychoko
 */
public interface EventDAO extends CrudRepository<Event, Long> {

}
