/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter

/**
 * @author Pakychoko
 *
 */
public class Group implements FNEntity{

	private Long id;
	
	private String name;
	
	private byte[] picture;
	
}
