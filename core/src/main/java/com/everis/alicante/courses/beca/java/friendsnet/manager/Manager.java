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
	
	public E save(E e);
	
	public Iterable<E> save(Iterable<E> ei);
	
	public E update(E e);
	
	public Iterable<E> update(Iterable<E> ei);
	
	public void remove(E e);
	
}
