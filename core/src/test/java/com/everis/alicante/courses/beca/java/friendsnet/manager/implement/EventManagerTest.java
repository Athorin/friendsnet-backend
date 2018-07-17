package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import org.junit.Assert;
import org.mockito.Mockito;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.EventDAO;

public class EventManagerTest {

	@InjectMocks
	private EventManager manager;
	
	@Mock
	private EventDAO<Event, Long> daoMock;
	
	@Test
	public void test() {
		//Arrange
		Event event = new Event();
		
		Mockito.when(daoMock.save(event)).thenReturn(event);
		
		//Act
		Event result = manager.save(event);
		
		//Assert
		Assert.assertEquals(expected, actual);
	}
}
