package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class EventDAOTest {

	@Autowired
	private EventDAO dao;

	@Test
	@DatabaseSetup("/db/events/initial.xml")
	public void testFindAll() {

		// Act
		final List<Event> all = (List<Event>) dao.findAll();

		// Assert
		Assert.assertEquals(2, all.size());
		Assert.assertEquals((Long) 1L, all.get(0).getId());
		Assert.assertEquals((Long) 2L, all.get(1).getId());

	}
	
	@Test
	@DatabaseSetup("/db/events/initial.xml")
	public void testFindById() {

		// Act
		final Event event =  dao.findById(1L).get();

		// Assert
		Assert.assertNotNull(event);
		Assert.assertEquals((Long)1L, event.getId());
		

	}

}
