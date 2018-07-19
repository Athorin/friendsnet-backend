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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PersonDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PersonManagerTest {



	@InjectMocks
	private PersonManagerImpl manager;
	
	@Mock
	private PersonDAO daoMock;


	
	@Test
	public void testfindAll() {
		//Arrange
		Iterable<Person> people = new ArrayList<Person>();

		
		Mockito.when(daoMock.findAll()).thenReturn(people);
		
		//Act
		Iterable<Person> result = manager.findAll();
		
		//Assert
		Assert.assertEquals(people, result);
	}
	
	@Test
	public void testfindById() {
		//Arrange
		Person person = new Person();

		Mockito.when(daoMock.findById(1L)).thenReturn(Optional.of(person));
		
		//Act
		Person result = manager.findById(1L);
		
		//Assert
		Assert.assertSame(person, result);
	}
	
	@Test
	public void testSave() {
		//Arrange
		Person person = new Person();
		
		Mockito.when(daoMock.save(person)).thenReturn(person);
		
		//Act
		Person result = manager.save(person);
		
		//Assert
		Assert.assertEquals(person, result);
	}
	
	@Test
	public void testSaveAll() {
		//Arrange
		Iterable<Person> people = new ArrayList<Person>();
		
		Mockito.when(daoMock.saveAll(people)).thenReturn(people);
		
		//Act
		Iterable<Person> result = manager.save(people);
		
		//Assert
		Assert.assertEquals(people, result);
	}	
	
	
	@Test
	public void testUpdate() {
		//Arrange
		Person person = new Person();
		
		Mockito.when(daoMock.save(person)).thenReturn(person);
		
		//Act
		Person result = manager.update(person);
		
		//Assert
		Assert.assertEquals(person, result);
	}
	
	@Test
	public void testUpdateAll() {
		//Arrange
		Iterable<Person> people = new ArrayList<Person>();
		
		Mockito.when(daoMock.saveAll(people)).thenReturn(people);
		
		//Act
		Iterable<Person> result = manager.update(people);
		
		//Assert
		Assert.assertEquals(people, result);
	}	
	
	
	@Test
	public void testRemove() {

	}
}
