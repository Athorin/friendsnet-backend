package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class PersonTest {

	
	@Test
	public void testPerson() {
	
		Person e = new Person();
		Date d = new Date("11/11/2011");	
		e.setId(1L);
		e.setName("Pepe");
		e.setSurname("Pepe2");

		// Assert
		Assert.assertNotNull(e);
		Assert.assertEquals((Long) 1L, e.getId());
		Assert.assertEquals((String) "Pepe",e.getName() );
		Assert.assertEquals((String) "Pepe2",e.getSurname() );
		Assert.assertNull(e.getPicture());
		Assert.assertNull(e.getFriends());
		Assert.assertNull(e.getFriendsOf());
		Assert.assertNull(e.getGroupsOf());
		Assert.assertNull(e.getEventsOf());
		Assert.assertNull(e.getLikeOf());

	}
}
