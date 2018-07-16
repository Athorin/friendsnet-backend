/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;

/**
 * @author Pakychoko
 *
 */
public interface PostManager<Post,Long> extends Manager<Post,Long> {

	public Post addLike(Like like);
}
