package com.everis.alicante.courses.beca.java.friendsnet.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Objeto de entrada/salida de Person
 * @author Pakychoko
 *
 */
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
