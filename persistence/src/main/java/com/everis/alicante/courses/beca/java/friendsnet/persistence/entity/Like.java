/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.LikeType;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter

/**
 * @author Pakychoko
 *
 */
@Entity(name = "LIKE_TABLE")
public class Like implements FNEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date creationDate;
	
	private LikeType type;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="person_id")
    private Person personOf;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="post_id")
	private Post postOf;
	
}
