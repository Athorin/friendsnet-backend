package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;

/**
 * Repositorio de Grupos
 * @author Pakychoko
 */
public interface GroupDAO extends CrudRepository<Group,Long> {
	
}
