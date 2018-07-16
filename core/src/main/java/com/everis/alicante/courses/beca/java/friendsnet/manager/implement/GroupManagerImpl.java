/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.Optional;

import com.everis.alicante.courses.beca.java.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author paco_
 *
 */
public class GroupManagerImpl implements GroupManager<Group,Long>{

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
	public void delete(Group group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Group> group) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Group addPersons(Iterable<Person> group) {
		// TODO Auto-generated method stub
		return null;
	}

}
