package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

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
public class GroupTest {

	@Test
	public void testGroup() {

		Group e = new Group();		
		e.setId(1L);
		e.setName("group1");

		// Assert
		Assert.assertNotNull(e);
		Assert.assertEquals((Long) 1L, e.getId());
		Assert.assertEquals((String) "group1",e.getName() );
		Assert.assertNull(e.getPicture());
		Assert.assertNull(e.getPersonsOf());	
	}

}
