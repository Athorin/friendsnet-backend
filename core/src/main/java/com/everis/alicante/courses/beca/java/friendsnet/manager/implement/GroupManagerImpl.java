/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.alicante.courses.beca.java.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.GroupDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * @author paco_
 *
 */
public class GroupManagerImpl implements GroupManager{

	@Autowired
	private GroupDAO<Group, Long> dao;

	@Override
	public Iterable<Group> findAll() {
		return dao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void save(Group group) {
		dao.save(group);
	}

	@Override
	public void save(Iterable<Group> groups) {
		dao.saveAll(groups);
	}

	@Override
	public void update(Group group) {
		dao.save(group);
	}

	@Override
	public void update(Iterable<Group> groups) {
		dao.saveAll(groups);
	}

	@Override
	public void remove(Group group) {
		dao.delete(group);
	}

	@Override
	public Group addPersons(Iterable<Person> group) {
		return dao.addPersons(group);
	}

}
