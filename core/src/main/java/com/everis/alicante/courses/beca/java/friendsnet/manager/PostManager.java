package com.everis.alicante.courses.beca.java.friendsnet.manager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * Interfaz del manager de Posts
 * @author Pakychoko
 */
public interface PostManager extends Manager<Post,Long> {

	/**
	 * Metodo que da un like a un post
	 * @param like
	 * @return Post
	 */
	public Post addLike(Like like);
}
