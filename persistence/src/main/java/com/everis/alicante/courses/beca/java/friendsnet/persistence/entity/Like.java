/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.Date;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.LikeType;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter

/**
 * @author Pakychoko
 *
 */
public class Like implements FNEntity {

	private Long id;
	
	private Date creationDate;
	
	private LikeType type;
	
}
