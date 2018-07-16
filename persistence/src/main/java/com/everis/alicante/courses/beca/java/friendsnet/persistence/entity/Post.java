/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.PostType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

/**
 * @author Pakychoko
 *
 */
public class Post implements FNEntity {

	private Long id;
	
	private String text;
	
	private Date creationDate;
	
	private PostType type;
	
	private byte[] picture;
	
}
