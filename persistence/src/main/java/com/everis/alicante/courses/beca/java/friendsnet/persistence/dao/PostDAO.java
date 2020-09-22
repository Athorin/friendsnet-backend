package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * Repositorio de Posts
 * @author Pakychoko
 */
public interface PostDAO extends CrudRepository<Post,Long>{

	//TODO public Post addLike(Like like);
}
