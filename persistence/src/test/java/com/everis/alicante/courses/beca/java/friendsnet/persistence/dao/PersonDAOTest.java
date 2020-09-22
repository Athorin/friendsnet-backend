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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class PersonDAOTest {

	@Autowired
	private PersonDAO dao;

	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testFindAll() {

		// Act
		final List<Person> all = (List<Person>) dao.findAll();

		// Assert
		Assert.assertEquals(2, all.size());
		Assert.assertEquals((Long) 1L, all.get(0).getId());
		Assert.assertEquals((Long) 2L, all.get(1).getId());
	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testFindById() {

		// Act
		final Person person =  dao.findById(1L).get();

		// Assert
		Assert.assertNotNull(person);
		Assert.assertEquals((Long)1L, person.getId());
	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testSave() {

		Person e = new Person();
		
		// Act
		final Person person =  dao.save(e);

		// Assert
		Assert.assertNotNull(person);
		Assert.assertEquals((Long)3L, person.getId());
	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testSaveAll() {

		List<Person> e = new ArrayList<Person>();
	
		e.add(new Person());
		e.add(new Person());
		e.add(new Person());

		// Act
		final List<Person> person =  (List<Person>) dao.saveAll(e);

		// Assert
		Assert.assertNotNull(person);
		Assert.assertEquals(3, person.size());
		Assert.assertEquals((Long)4L, person.get(0).getId());
	}
	
}
