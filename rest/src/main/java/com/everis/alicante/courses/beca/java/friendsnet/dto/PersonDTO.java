package com.everis.alicante.courses.beca.java.friendsnet.dto;

import java.util.List;


import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Event;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Group;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Person;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonDTO {

	private Long id;

	private String name;

	private String surname;

	private byte[] picture;
	
//
//	private List<Person> friends;
//
//	private List<Person> friendsOf;
//
//	private List<Group> groupsOf;
//
//	private List<Event> eventsOf;
//
//	private List<Post> postsOf;
//
//	private List<Like> likeOf;
}
