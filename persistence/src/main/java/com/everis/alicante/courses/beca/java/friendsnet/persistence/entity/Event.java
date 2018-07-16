/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.EventType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

/**
 * @author Pakychoko
 *
 */
public class Event implements FNEntity{

	private Long id;
	
	private String name;
	
	private Date startingDate;
	
	private Date endingDate;
	
	private EventType type;
	
	private byte[] picture;
	
}
