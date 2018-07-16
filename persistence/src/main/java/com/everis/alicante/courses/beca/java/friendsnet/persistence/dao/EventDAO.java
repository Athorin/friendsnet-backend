/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Pakychoko
 *
 */
public interface EventDAO<Event,Long> extends CrudRepository<Event,Long>{

}
