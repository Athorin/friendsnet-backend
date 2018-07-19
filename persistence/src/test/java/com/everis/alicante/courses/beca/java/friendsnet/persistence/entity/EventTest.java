package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.EventType;
import com.github.springtestdbunit.DbUnitTestExecutionListener;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class EventTest {


	
	@Test
	public void testEvent() {

		
		Event e = new Event();
		Date d = new Date("11/11/2011");
		
		e.setId(1L);
		e.setName("Pepe");
		e.setStartingDate(d);
		e.setEndingDate(d);
		e.setType(EventType.PARTY);


		// Assert
		Assert.assertNotNull(e);
		Assert.assertEquals((Long) 1L, e.getId());
		Assert.assertEquals((String) "Pepe",e.getName() );
		Assert.assertEquals((Date) d, e.getStartingDate());
		Assert.assertEquals((Date) d, e.getStartingDate());
		Assert.assertEquals((EventType) EventType.PARTY, e.getType());
		Assert.assertNull(e.getPicture());
		Assert.assertNull(e.getPersonsOf());
		Assert.assertNull(e.getPostsOf());

	}
	
	
}
