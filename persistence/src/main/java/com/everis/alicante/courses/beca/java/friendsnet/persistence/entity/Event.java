/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.EventType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

/**
 * @author Pakychoko
 *
 */
@Entity
public class Event implements FNEntity{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Date startingDate;
	
	private Date endingDate;
	
	private EventType type;
	
	private byte[] picture;
	
	
    @ManyToMany
    @JoinTable(name="PERSONS_OF_EVENT", 
    joinColumns = @JoinColumn(name="person_id"),
    inverseJoinColumns = @JoinColumn(name="event_id"))
    private List<Person> personsOf;
    
    @OneToMany(mappedBy = "event_id")
    private List<Post> postsOf;
	
}
