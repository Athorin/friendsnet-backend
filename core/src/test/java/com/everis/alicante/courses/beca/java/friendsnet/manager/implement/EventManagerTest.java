package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.everis.alicante.courses.beca.java.friendsnet.manager.EventManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EventDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;

public class EventManagerTest {

	@InjectMocks
	private EventManager manager;
	
	@Mock
	private EventDAO daoMock;
	
	@Test
	public void test() {
		//Arrange
		Event event = new Event();
		
		Mockito.when(daoMock.save(event)).thenReturn(event);
		
		//Act
		Event result = manager.save(event);
		
		//Assert
		Assert.assertEquals(event, result);
	}
}
