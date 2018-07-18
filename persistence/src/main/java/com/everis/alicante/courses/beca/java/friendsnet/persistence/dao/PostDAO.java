/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import org.springframework.data.repository.CrudRepository;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
public interface PostDAO extends CrudRepository<Post,Long>{

	//public Post addLike(Like like);
}
