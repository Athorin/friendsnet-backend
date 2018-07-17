package com.everis.alicante.courses.beca.java.friendsnet.dto;

import java.util.Date;
import java.util.List;


import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.EventType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EventDTO {

	private Long id;
	
	private String name;
	
	private Date startingDate;
	
	private Date endingDate;
	
	private EventType type;
	
	private byte[] picture;
	

    private List<Person> personsOf;

    private List<Post> postsOf;
}
