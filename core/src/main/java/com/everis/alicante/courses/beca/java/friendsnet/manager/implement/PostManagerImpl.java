/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PostManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PostDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
public class PostManagerImpl implements PostManager {

	@Autowired
	private PostDAO<Post, Long> dao;

	@Override
	public Iterable<Post> findAll() {
		return dao.findAll();
	}

	@Override
	public Post findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void save(Post post) {
		dao.save(post);
	}

	@Override
	public void save(Iterable<Post> posts) {
		dao.saveAll(posts);
	}

	@Override
	public void update(Post post) {
		dao.save(post);
	}

	@Override
	public void update(Iterable<Post> posts) {
		dao.saveAll(posts);
	}

	@Override
	public void remove(Post post) {
		dao.delete(post);
	}

	@Override
	public Post addLike(Like like) {
		return dao.addLike(like);
	}
	

}
