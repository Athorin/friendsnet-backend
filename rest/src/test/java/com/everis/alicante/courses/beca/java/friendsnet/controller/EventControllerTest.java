package com.everis.alicante.courses.beca.java.friendsnet.controller;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.everis.alicante.courses.beca.java.friendsnet.dto.EventDTO;
import com.everis.alicante.courses.beca.java.friendsnet.manager.implement.EventManagerImpl;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class EventControllerTest {

	@InjectMocks
	private EventController controller;
	
	@Mock
	private EventManagerImpl managerMock;
	
	@Mock
	private DozerBeanMapper mapper;
	
	@Test
	public void testGetAll() {
		//Arrange
		Iterable<Event> events = new ArrayList<Event>();
		List<EventDTO> eventsDTO = new ArrayList<EventDTO>();
		
		Mockito.when(managerMock.findAll()).thenReturn(events);
		
		for(Event e: events) {
			eventsDTO.add(mapper.map(e, EventDTO.class));
		}
		
		//Act
		Iterable<EventDTO> result = controller.getAll();
		
		//Assert
		Assert.assertEquals((Iterable<EventDTO>) eventsDTO, result);
	}
	
	@Test
	public void testGetById() {
		//Arrange
		Event event = new Event();

		
		Mockito.when(managerMock.findById(1L)).thenReturn(event);
		
		//Act
		EventDTO result = controller.getById(1L);
		
		//Assert
		Assert.assertEquals(mapper.map(event, EventDTO.class), result);
	}
	
	@Test
	public void testAddPerson() {
		//Arrange
		Event event = new Event();
		
		Mockito.when(managerMock.addPerson(1L, 1L)).thenReturn(event);
		
		//Act
		EventDTO result = controller.addPerson(1L, 1L);
		
		//Assert
		Assert.assertEquals(mapper.map(event, EventDTO.class), result);
	}
	

	

}
