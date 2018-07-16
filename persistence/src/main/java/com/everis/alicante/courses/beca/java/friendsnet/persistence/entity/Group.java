/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter

/**
 * @author Pakychoko
 *
 */
@Entity
public class Group implements FNEntity{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private byte[] picture;
	
	
    @ManyToMany
    @JoinTable(name="PERSONS_OF_GROUP", 
    joinColumns = @JoinColumn(name="person_id"),
    inverseJoinColumns = @JoinColumn(name="group_id"))    
    private List<Person> personsOf;
	
}
