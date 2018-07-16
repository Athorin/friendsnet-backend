/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.manager.implement;

import java.util.Optional;

import com.everis.alicante.courses.beca.java.friendsnet.manager.PostManager;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
public class PostManagerImpl implements PostManager<Post,Long> {

	@Override
	public <S extends Post> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Post> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Post> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Post> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Post> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Post entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Post> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Post addLike(Like like) {
		// TODO Auto-generated method stub
		return null;
	}

}
