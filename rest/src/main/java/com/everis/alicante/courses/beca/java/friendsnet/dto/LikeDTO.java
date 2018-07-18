package com.everis.alicante.courses.beca.java.friendsnet.dto;

import java.util.Date;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.enumType.LikeType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeDTO {

	private Long id;

	private Date creationDate;

	private LikeType type;
}
