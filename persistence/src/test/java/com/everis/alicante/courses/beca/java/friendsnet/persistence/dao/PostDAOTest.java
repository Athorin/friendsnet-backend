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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PostDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class PostDAOTest {

	@Autowired
	private PostDAO dao;

	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testFindAll() {

		// Act
		final List<Post> all = (List<Post>) dao.findAll();

		// Assert
		Assert.assertEquals(2, all.size());
		Assert.assertEquals((Long) 1L, all.get(0).getId());
		Assert.assertEquals((Long) 2L, all.get(1).getId());

	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testFindById() {

		// Act
		final Post post =  dao.findById(1L).get();

		// Assert
		Assert.assertNotNull(post);
		Assert.assertEquals((Long)1L, post.getId());
		

	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testSave() {

		Post e = new Post();
		
		// Act
		final Post post =  dao.save(e);

		// Assert
		Assert.assertNotNull(post);
		Assert.assertEquals((Long)3L, post.getId());
		

	}
	
	@Test
	@DatabaseSetup("/db/dao/initial.xml")
	public void testSaveAll() {

		List<Post> e = new ArrayList();
	
		e.add(new Post());
		e.add(new Post());
		e.add(new Post());

		// Act
		final List<Post> post =  (List<Post>) dao.saveAll(e);

		// Assert
		Assert.assertNotNull(post);
		Assert.assertEquals(3, post.size());
		Assert.assertEquals((Long)4L, post.get(0).getId());
		
	}
		

}
