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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.PostType;
import com.github.springtestdbunit.DbUnitTestExecutionListener;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class PostTest {

	
	@Test
	public void testPost() {
	
		Post e = new Post();
		Date d = new Date("11/11/2011");
		e.setId(1L);
		e.setText("Pepe");
		e.setCreationDate(d);
		e.setType(PostType.OTHER);

		// Assert
		Assert.assertNotNull(e);
		Assert.assertEquals((Long) 1L, e.getId());
		Assert.assertEquals((String) "Pepe",e.getText() );
		Assert.assertEquals((Date) d, e.getCreationDate());
		Assert.assertEquals((PostType) PostType.OTHER, e.getType());
		Assert.assertNull(e.getPicture());
		Assert.assertNull(e.getLikesOf());
		Assert.assertNull(e.getPersonOf());
		Assert.assertNull(e.getEventOf());
	}
	
	
}
