/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.implement;

import java.util.Optional;

import javax.persistence.EntityManager;

import com.everis.alicante.courses.beca.java.friendsnet.persistence.dao.PostDAO;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Like;
import com.everis.alicante.courses.beca.java.friendsnet.persistence.entity.Post;

/**
 * @author Pakychoko
 *
 */
public class PostDAOImpl extends AbstractDAO<Post,Long> implements PostDAO<Post,Long>{

	@Override
	public <S extends Post> S save(S post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Post> Iterable<S> saveAll(Iterable<S> posts) {
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
	public void delete(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Post> posts) {
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

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}





}
