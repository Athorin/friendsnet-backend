package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.java.friendsnet.manager.GroupManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.GroupDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

/**
 * Implementacion del manager de grupos
 * @author Pakychoko
 *
 */
@Service
public class GroupManagerImpl implements GroupManager{

	@Autowired
	private GroupDAO dao;

	@Override
	public Iterable<Group> findAll() {
		return dao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public Group save(Group group) {
		return dao.save(group);
	}

	@Override
	public Iterable<Group> save(Iterable<Group> groups) {
		return dao.saveAll(groups);
	}

	@Override
	public Group update(Group group) {
		return dao.save(group);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> groups) {
		return dao.saveAll(groups);
	}

	@Override
	public void remove(Group group) {
		dao.delete(group);
	}

	@Override
	public Group addPersons(Long id, Iterable<Person> people) {
		Group group = dao.findById(id).get();
		group.getPersonsOf().addAll((Collection<? extends Person>) people);
		return group;
	}

}
