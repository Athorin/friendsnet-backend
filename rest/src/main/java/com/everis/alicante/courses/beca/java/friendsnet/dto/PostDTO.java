package com.everis.alicante.courses.beca.java.friendsnet.dto;

import java.util.Date;
import java.util.List;


import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.PostType;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class PostDTO {

	private Long id;
	
	private String text;
	
	private Date creationDate;
	
	private PostType type;
	
	private byte[] picture;
	

	private List<Like> likesOf;

	private Person personOf;

	private Event eventOf;
}
