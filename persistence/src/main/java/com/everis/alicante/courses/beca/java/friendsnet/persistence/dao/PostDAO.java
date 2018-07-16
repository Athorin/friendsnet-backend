/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
public interface PostDAO<Post,Long> extends EntityDAO<Post,Long>{

	public Post addLike(Like like);
}
