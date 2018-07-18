/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter

/**
 * @author Pakychoko
 *
 */
@Entity  
public class Person implements FNEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String surname;

	private byte[] picture;

	@ManyToMany
	@JoinTable(name = "PERSONS_OF_FRIEND", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "friend_id"))
	private List<Person> friends;

	@ManyToMany(mappedBy = "friends")
	private List<Person> friendsOf;

	@ManyToMany
	@JoinTable(name = "GROUPS_OF_PERSON", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "group_id"))
	private List<Group> groupsOf;

	@ManyToMany
	@JoinTable(name = "EVENTS_OF_PERSON", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
	private List<Event> eventsOf;

	@OneToMany(mappedBy = "personOf")
	private List<Post> postsOf;

	@OneToMany(mappedBy = "personOf")
	private List<Like> likeOf;

}
