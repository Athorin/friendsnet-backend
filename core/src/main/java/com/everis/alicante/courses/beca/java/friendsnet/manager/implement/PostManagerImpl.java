/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PostManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PostDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
@Service
public class PostManagerImpl implements PostManager {

	@Autowired
	private PostDAO dao;

	@Override
	public Iterable<Post> findAll() {
		return dao.findAll();
	}

	@Override
	public Post findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return dao.save(post);
	}

	@Override
	public Iterable<Post> save(Iterable<Post> posts) {
		return dao.saveAll(posts);
	}

	@Override
	public Post update(Post post) {
		return dao.save(post);
	}

	@Override
	public Iterable<Post> update(Iterable<Post> posts) {
		return dao.saveAll(posts);
	}

	@Override
	public void remove(Post post) {
		dao.delete(post);
	}

	@Override
	public Post addLike(Like like) {
		return null;
	}
	

}
