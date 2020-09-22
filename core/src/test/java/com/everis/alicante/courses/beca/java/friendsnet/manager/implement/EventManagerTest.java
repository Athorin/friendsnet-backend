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

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EventDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PersonDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EventManagerTest {

	@InjectMocks
	private EventManagerImpl manager;
	
	@Mock
	private EventDAO daoMock;
	
	@Mock
	private PersonDAO pdaoMock;

	
	@Test
	public void testfindAll() {
		//Arrange
		Iterable<Event> events = new ArrayList<Event>();

		
		Mockito.when(daoMock.findAll()).thenReturn(events);
		
		//Act
		Iterable<Event> result = manager.findAll();
		
		//Assert
		Assert.assertEquals(events, result);
	}
	
	@Test
	public void testfindById() {
		//Arrange
		Event event = new Event();

		Mockito.when(daoMock.findById(1L)).thenReturn(Optional.of(event));
		
		//Act
		Event result = manager.findById(1L);
		
		//Assert
		Assert.assertSame(event, result);
	}
	
	@Test
	public void testSave() {
		//Arrange
		Event event = new Event();
		
		Mockito.when(daoMock.save(event)).thenReturn(event);
		
		//Act
		Event result = manager.save(event);
		
		//Assert
		Assert.assertEquals(event, result);
	}
	
	@Test
	public void testSaveAll() {
		//Arrange
		Iterable<Event> events = new ArrayList<Event>();
		
		Mockito.when(daoMock.saveAll(events)).thenReturn(events);
		
		//Act
		Iterable<Event> result = manager.save(events);
		
		//Assert
		Assert.assertEquals(events, result);
	}	
	
	
	@Test
	public void testUpdate() {
		//Arrange
		Event event = new Event();
		
		Mockito.when(daoMock.save(event)).thenReturn(event);
		
		//Act
		Event result = manager.update(event);
		
		//Assert
		Assert.assertEquals(event, result);
	}
	
	@Test
	public void testUpdateAll() {
		//Arrange
		Iterable<Event> events = new ArrayList<Event>();
		
		Mockito.when(daoMock.saveAll(events)).thenReturn(events);
		
		//Act
		Iterable<Event> result = manager.update(events);
		
		//Assert
		Assert.assertEquals(events, result);
	}	
	
	
	@Test
	public void testRemove() {

	}
	
	//TODO
//	@Test
//	public void testAddPerson() {
//		
//		//Arrange
//		Event event = new Event();
//		event.setId(1L);
//		Person person = new Person();
//		person.setId(1L);
//		
//		Event p1 = daoMock.findById(1L).get();
//		Person e1 = pdaoMock.findById(1L).get();
//		
//		//Act
//		Event result = manager.addPerson(1L, 1L);
//		
//
//		
//		//Assert
//		Assert.assertEquals(event, result);
//	}
	

	
	
	
}
