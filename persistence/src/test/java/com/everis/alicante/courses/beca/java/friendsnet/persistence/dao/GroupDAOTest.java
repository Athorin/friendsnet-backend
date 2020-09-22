package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

/**
 * Tests del repositorio de grupos
 * @author Pakychoko
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class GroupDAOTest {

	@Autowired
	private GroupDAO dao;

	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testFindAll() {

		// Act
		final List<Group> all = (List<Group>) dao.findAll();

		// Assert
		Assert.assertEquals(2, all.size());
		Assert.assertEquals((Long) 1L, all.get(0).getId());
		Assert.assertEquals((Long) 2L, all.get(1).getId());
	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testFindById() {

		// Act
		final Group group =  dao.findById(1L).get();

		// Assert
		Assert.assertNotNull(group);
		Assert.assertEquals((Long)1L, group.getId());
	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testSave() {

		Group e = new Group();
		
		// Act
		final Group group =  dao.save(e);

		// Assert
		Assert.assertNotNull(group);
		Assert.assertEquals((Long)3L, group.getId());
	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testSaveAll() {

		List<Group> e = new ArrayList<Group>();
	
		e.add(new Group());
		e.add(new Group());
		e.add(new Group());

		// Act
		final List<Group> group =  (List<Group>) dao.saveAll(e);

		// Assert
		Assert.assertNotNull(group);
		Assert.assertEquals(3, group.size());
		Assert.assertEquals((Long)4L, group.get(0).getId());
	}
	
}
