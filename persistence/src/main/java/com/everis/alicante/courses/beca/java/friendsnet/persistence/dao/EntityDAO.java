/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Pakychoko
 * @param <T>
 * @param <ID>
 */
public interface EntityDAO <T,ID> extends CrudRepository<T,ID>{
	

}
