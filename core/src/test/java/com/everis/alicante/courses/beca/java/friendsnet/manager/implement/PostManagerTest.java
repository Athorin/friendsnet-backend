package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PostDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PostManagerTest {



	@InjectMocks
	private PostManagerImpl manager;
	
	@Mock
	private PostDAO daoMock;


	
	@Test
	public void testfindAll() {
		//Arrange
		Iterable<Post> posts = new ArrayList<Post>();

		
		Mockito.when(daoMock.findAll()).thenReturn(posts);
		
		//Act
		Iterable<Post> result = manager.findAll();
		
		//Assert
		Assert.assertEquals(posts, result);
	}
	
	@Test
	public void testfindById() {
		//Arrange
		Post post = new Post();

		Mockito.when(daoMock.findById(1L)).thenReturn(Optional.of(post));
		
		//Act
		Post result = manager.findById(1L);
		
		//Assert
		Assert.assertSame(post, result);
	}
	
	@Test
	public void testSave() {
		//Arrange
		Post post = new Post();
		
		Mockito.when(daoMock.save(post)).thenReturn(post);
		
		//Act
		Post result = manager.save(post);
		
		//Assert
		Assert.assertEquals(post, result);
	}
	
	@Test
	public void testSaveAll() {
		//Arrange
		Iterable<Post> posts = new ArrayList<Post>();
		
		Mockito.when(daoMock.saveAll(posts)).thenReturn(posts);
		
		//Act
		Iterable<Post> result = manager.save(posts);
		
		//Assert
		Assert.assertEquals(posts, result);
	}	
	
	
	@Test
	public void testUpdate() {
		//Arrange
		Post post = new Post();
		
		Mockito.when(daoMock.save(post)).thenReturn(post);
		
		//Act
		Post result = manager.update(post);
		
		//Assert
		Assert.assertEquals(post, result);
	}
	
	@Test
	public void testUpdateAll() {
		//Arrange
		Iterable<Post> posts = new ArrayList<Post>();
		
		Mockito.when(daoMock.saveAll(posts)).thenReturn(posts);
		
		//Act
		Iterable<Post> result = manager.update(posts);
		
		//Assert
		Assert.assertEquals(posts, result);
	}	
	
	
	@Test
	public void testRemove() {

	}
	
	@Test
	public void testAddLike() {
		
	}
	
}
