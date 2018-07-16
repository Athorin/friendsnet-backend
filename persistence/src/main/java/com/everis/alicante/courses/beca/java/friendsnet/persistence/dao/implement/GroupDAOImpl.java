/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.implement;

import java.util.Optional;

import javax.persistence.EntityManager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.GroupDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;

/**
 * @author Pakychoko
 *
 */
public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO<Group,Long>{

	@Override
	public <S extends Group> S save(S group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Group> Iterable<S> saveAll(Iterable<S> groups) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Group> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Group> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Group> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Group entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Group> groups) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Group addPersons(Iterable<Group> person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}



}
