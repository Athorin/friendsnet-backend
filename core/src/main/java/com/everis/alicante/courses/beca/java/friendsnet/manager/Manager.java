/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;


/**
 * @author Pakychoko
 *
 */
public interface Manager<E,ID>{

	public Iterable<E> findAll();
	
	public E findById(ID id);
	
	public void save(E e);
	
	public void save(Iterable<E> ei);
	
	public void update(E e);
	
	public void update(Iterable<E> ei);
	
	public void remove(E e);
	
}
