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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.LikeType;
import com.github.springtestdbunit.DbUnitTestExecutionListener;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class LikeTest {

	@Test
	public void testLike() {

		
		Like e = new Like();
		Date d = new Date("11/11/2011");
		e.setId(1L);
		e.setCreationDate(d);
		e.setType(LikeType.ARGH);

		// Assert
		Assert.assertNotNull(e);
		Assert.assertEquals((Long) 1L, e.getId());
		Assert.assertEquals((Date) d, e.getCreationDate());
		Assert.assertEquals((LikeType) LikeType.ARGH, e.getType());
		Assert.assertNull(e.getPersonOf());
		Assert.assertNull(e.getPostOf());
	}
}
