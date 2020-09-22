package com.everis.alicante.courses.beca.java.friendsnet.manager;


/**
 * Interfaz generica con los metodos basicos
 * @author Pakychoko
 */
public interface Manager<E,ID>{

	/**
	 * Metodo que consulta todos los objetos del tipo definido
	 * @return Iterable<E>
	 */
	public Iterable<E> findAll();
	
	/**
	 * Metodo que consulta un objeto por su Id
	 * @param id
	 * @return E
	 */
	public E findById(ID id);
	
	/**
	 * Metodo que da de alta un objeto
	 * @param e
	 * @return E
	 */
	public E save(E e);
	
	/**
	 * Metodo que da de alta una lista de objets
	 * @param e
	 * @return Iterable<E>
	 */
	public Iterable<E> save(Iterable<E> e);
	
	/**
	 * Metodo que actualiza un objeto
	 * @param e
	 * @return E
	 */
	public E update(E e);
	
	/**
	 * Metodo que actualiza una lista de objetos
	 * @param e
	 * @return Iterable<E>
	 */
	public Iterable<E> update(Iterable<E> e);
	
	/**
	 * Metodo que da de baja un objeto
	 * @param e
	 */
	public void remove(E e);
	
}
