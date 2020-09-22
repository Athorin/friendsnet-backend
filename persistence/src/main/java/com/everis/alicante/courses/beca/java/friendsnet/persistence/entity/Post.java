package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.PostType;

import lombok.Data;

/**
 * Entity de Post
 * @author Pakychoko
 */
@Data
@Entity
public class Post implements FNEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String text;
	
	private Date creationDate;
	
	private PostType type;
	
	private byte[] picture;
	
	@OneToMany(mappedBy = "postOf")
    private List<Like> likesOf;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="person_id")
	private Person personOf;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="event_id")
	private Event eventOf;
	
}
