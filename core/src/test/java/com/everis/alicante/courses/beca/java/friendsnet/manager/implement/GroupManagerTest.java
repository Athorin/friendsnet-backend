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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.GroupDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class GroupManagerTest {


	@InjectMocks
	private GroupManagerImpl manager;
	
	@Mock
	private GroupDAO daoMock;
	
	
	@Test
	public void testfindAll() {
		//Arrange
		Iterable<Group> groups = new ArrayList<Group>();

		//Mock function
		Mockito.when(daoMock.findAll()).thenReturn(groups);
		
		//Act
		Iterable<Group> result = manager.findAll();
		
		//Assert
		Assert.assertEquals(groups, result);
	}
	
	@Test
	public void testfindById() {
		//Arrange
		Group group = new Group();

		//Mock function
		Mockito.when(daoMock.findById(1L)).thenReturn(Optional.of(group));
		
		//Act
		Group result = manager.findById(1L);
		
		//Assert
		Assert.assertSame(group, result);
	}
	
	@Test
	public void testSave() {
		//Arrange
		Group group = new Group();
		
		//Mock function
		Mockito.when(daoMock.save(group)).thenReturn(group);
		
		//Act
		Group result = manager.save(group);
		
		//Assert
		Assert.assertEquals(group, result);
	}
	
	@Test
	public void testSaveAll() {
		//Arrange
		Iterable<Group> groups = new ArrayList<Group>();
		
		//Mock function
		Mockito.when(daoMock.saveAll(groups)).thenReturn(groups);
		
		//Act
		Iterable<Group> result = manager.save(groups);
		
		//Assert
		Assert.assertEquals(groups, result);
	}	
	
	
	@Test
	public void testUpdate() {
		//Arrange
		Group group = new Group();
		
		//Mock function
		Mockito.when(daoMock.save(group)).thenReturn(group);
		
		//Act
		Group result = manager.update(group);
		
		//Assert
		Assert.assertEquals(group, result);
	}
	
	@Test
	public void testUpdateAll() {
		//Arrange
		Iterable<Group> groups = new ArrayList<Group>();
		
		//Mock function
		Mockito.when(daoMock.saveAll(groups)).thenReturn(groups);
		
		//Act
		Iterable<Group> result = manager.update(groups);
		
		//Assert
		Assert.assertEquals(groups, result);
	}	
	
	
	@Test
	public void testRemove() {

	}
	
	//TODO
//	@Test
//	public void testAddPersons() {
//		
//		//Arrange
//		Group group = new Group();
//		group.setId(1L);
//
//		Iterable<Person> p = new ArrayList<Person>();
//		
//		//Mock function
//		Mockito.when(daoMock.findById(1L)).thenReturn(Optional.of(group));
//		
//		Group p1 = daoMock.findById(1L).get();
//
//		
//		//Act
//		Group result = manager.addPersons(1L, p);
//		
//
//		
//		//Assert
//		Assert.assertEquals(group, result);
//	}
	
}
