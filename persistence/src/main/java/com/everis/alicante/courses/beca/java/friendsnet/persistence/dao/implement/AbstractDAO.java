/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.implement;

import javax.persistence.EntityManager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EntityDAO;

/**
 * @author Pakychoko
 * @param <T>
 * @param <ID>
 *
 */
public abstract class AbstractDAO<T,ID> implements EntityDAO<T,ID> {

	private Class<T> persistentClass;
	
	private EntityManager entityManager;
	
	
	public abstract EntityManager getEntityManager();
}
