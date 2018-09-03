/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.unlockjava.web.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.unlockjava.web.model.Posts;
import com.unlockjava.web.repository.PostsRepository;

/**
 *
 * @author DIBYA
 */
@Transactional
@Repository
public class PostsDao {

	@Autowired
	private PostsRepository postsRepository;

	// Saving a Article Post
	public void addPost(Posts posts) {
		postsRepository.save(posts);
	}

	public void updatePost(Posts posts) {
		Optional<Posts> optionalPost = postsRepository.findById(posts.getPostId());
		if (optionalPost.isPresent()) {
			Posts returnedPost = optionalPost.get();
			returnedPost.setPostTitle(posts.getPostTitle());
			returnedPost.setPostCategory(posts.getPostCategory());
			returnedPost.setPostContent(posts.getPostContent());
			returnedPost.setPostExpert(posts.getPostExpert());
			returnedPost.setPostTags(posts.getPostTags());
			returnedPost.setPostUpdatedDate(posts.getPostUpdatedDate());
			postsRepository.save(returnedPost);
		}
	}

	public List<Posts> getLatestPosts() {
		Page<Posts> pagable = postsRepository
				.findAll(new PageRequest(0, 4, new Sort(Sort.Direction.DESC, "postCreatedDate")));
		return pagable.getContent();
	}

	public List<Posts> getAllPostsByDate() {
		Page<Posts> pagable = postsRepository
				.findAll(new PageRequest(0, Integer.MAX_VALUE, new Sort(Sort.Direction.DESC, "postCreatedDate")));
		return pagable.getContent();
	}

	public List<Posts> getPopularPosts() {
		Page<Posts> pagable = postsRepository
				.findAll(new PageRequest(0, 5, new Sort(Sort.Direction.DESC, "postViews")));
		return pagable.getContent();
	}

	public List<Posts> getPostsByCategory(String cat) {
		Page<Posts> pagable = postsRepository.findByPostCategory(cat,
				new PageRequest(0, 10, new Sort(Sort.Direction.DESC, "postCreatedDate")));
		return pagable.getContent();
	}

	public Posts getPostView(int postId) {
		Optional<Posts> optionalPost = postsRepository.findById(postId);
		if (optionalPost.isPresent()) {
			return optionalPost.get();
		}
		return null;

	}

	public Posts getPostViewByUri(String uri) {
		return postsRepository.findByPostUri(uri);
	}

	public Posts getPostViewById(Integer id) {
		return postsRepository.findByPostId(id);
	}

	public void setViews(int views, int id) {
		postsRepository.setViews(views, id);
	}
}
