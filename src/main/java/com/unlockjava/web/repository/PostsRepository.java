/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.unlockjava.web.model.Posts;

/**
 *
 * @author DIBYA
 */
public interface PostsRepository extends CrudRepository<Posts, Integer> {
	
	

	Page<Posts> findAll(Pageable pageable);

	public Posts findByPostUri(String uri);

	public Posts findByPostId(Integer id);

	public Page<Posts> findByPostCategory(String postCategory, Pageable pageable);

	@Modifying
	@Query("update Posts p set p.postViews = :view where p.postId = :id")
	void setViews(@Param("view") int views, @Param("id") int id);

}
