/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.unlockjava.web.dao.PostsDao;
import com.unlockjava.web.dto.PostsDto;
import com.unlockjava.web.model.Posts;

/**
 *
 * @author DIBYA
 */
@Service
public class PostsService {

    @Autowired
    private PostsDao dao;

    @Value("${url.badwords}")
    private String badWords;

    public void addPost(PostsDto postDto) {
        Posts post = new Posts();
        post.setPostId(0);
        String title = postDto.getPost_title();
        String finalTitle = title.trim().replaceAll("\\s+", " ").replaceAll("[^A-Za-z0-9 ]", "");
        post.setPostTitle(finalTitle);
        post.setPostContent(postDto.getPost_content());
        post.setPostCategory(postDto.getPost_category());
        post.setPostCreatedDate(new Date());
        post.setPostUpdatedDate(new Date());

        String uri = createPostUri(title, badWords);
        post.setPostUri(uri);
        post.setPostTags(postDto.getPost_tags());

        String content = postDto.getPost_content();
        String expert = content.substring(0, 500);
        post.setPostExpert(expert);
        post.setPostViews(0);
        dao.addPost(post);
    }

    public void updatePost(PostsDto postDto) {
        Posts post = new Posts();
        post.setPostId(postDto.getPost_id());
        String title = postDto.getPost_title();
        String finalTitle = title.trim().replaceAll("\\s+", " ").replaceAll("[^A-Za-z0-9 ]", "");
        post.setPostTitle(finalTitle);
        post.setPostContent(postDto.getPost_content());
        post.setPostCategory(postDto.getPost_category());
        post.setPostUpdatedDate(new Date());
        post.setPostTags(postDto.getPost_tags());
        String content = postDto.getPost_content();
        System.out.println(content);
        String expert = content.substring(0, 500);
        post.setPostExpert(expert);
        dao.updatePost(post);
    }

    public List<PostsDto> getAllPostsForCp() {
        List<Posts> latestPosts = dao.getAllPostsByDate();
        List<PostsDto> latestPostsDto = new ArrayList<>();
        for (Posts posts : latestPosts) {
            PostsDto dto = new PostsDto();
            dto.setPost_id(posts.getPostId());
            dto.setPost_title(posts.getPostTitle());
            dto.setPost_category(posts.getPostCategory());
            dto.setPost_content(posts.getPostContent());
            dto.setPost_created_date(posts.getPostCreatedDate());
            dto.setPost_expert(posts.getPostExpert().replaceAll("\\<.*?>", ""));
            dto.setPost_tags(posts.getPostTags());
            dto.setPost_updated_date(posts.getPostUpdatedDate());
            dto.setPost_uri(posts.getPostUri());
            dto.setPost_cat_uri(createPostCatUri(posts.getPostCategory()));
            dto.setPost_views(posts.getPostViews());
            latestPostsDto.add(dto);
        }
        return latestPostsDto;
    }

    public List<PostsDto> getLatestPostsForHome() {
        List<Posts> latestPosts = dao.getLatestPosts();
        List<PostsDto> latestPostsDto = new ArrayList<>();
        for (Posts posts : latestPosts) {
            PostsDto dto = new PostsDto();
            dto.setPost_id(posts.getPostId());
            dto.setPost_title(posts.getPostTitle());
            dto.setPost_category(posts.getPostCategory());
            dto.setPost_content(posts.getPostContent());
            dto.setPost_created_date(posts.getPostCreatedDate());
            dto.setPost_expert(posts.getPostExpert().replaceAll("\\<.*?>", ""));
            dto.setPost_tags(posts.getPostTags());
            dto.setPost_updated_date(posts.getPostUpdatedDate());
            dto.setPost_uri(posts.getPostUri());
            dto.setPost_cat_uri(createPostCatUri(posts.getPostCategory()));
            dto.setPost_views(posts.getPostViews());
            latestPostsDto.add(dto);
        }
        return latestPostsDto;
    }

    public PostsDto getPostViewById(int postId) {
        Posts posts = dao.getPostView(postId);
        PostsDto dto = new PostsDto();
        dto.setPost_id(posts.getPostId());
        dto.setPost_title(posts.getPostTitle());
        dto.setPost_category(posts.getPostCategory());
        dto.setPost_content(posts.getPostContent());
        dto.setPost_created_date(posts.getPostCreatedDate());
        dto.setPost_expert(posts.getPostExpert().replaceAll("\\<.*?>", ""));
        dto.setPost_tags(posts.getPostTags());
        dto.setPost_updated_date(posts.getPostUpdatedDate());
        dto.setPost_uri(posts.getPostUri());
        dto.setPost_views(posts.getPostViews());
        return dto;

    }

    public PostsDto getPostByUri(String uri) {
        Posts posts = dao.getPostViewByUri(uri);
        PostsDto dto = new PostsDto();
        dto.setPost_id(posts.getPostId());
        dto.setPost_title(posts.getPostTitle());
        dto.setPost_category(posts.getPostCategory());
        dto.setPost_content(posts.getPostContent());
        dto.setPost_created_date(posts.getPostCreatedDate());
        dto.setPost_expert(posts.getPostExpert().replaceAll("\\<.*?>", ""));
        dto.setPost_tags(posts.getPostTags());
        dto.setPost_updated_date(posts.getPostUpdatedDate());
        dto.setPost_cat_uri(createPostCatUri(posts.getPostCategory()));
        dto.setPost_uri(posts.getPostUri());
        dto.setPost_views(posts.getPostViews());
        return dto;

    }

    public PostsDto getPostsById(Integer id) {
        Posts postById = dao.getPostViewById(id);
        PostsDto dto = new PostsDto();
        dto.setPost_id(postById.getPostId());
        dto.setPost_title(postById.getPostTitle());
        dto.setPost_category(postById.getPostCategory());
        dto.setPost_content(postById.getPostContent());
        dto.setPost_created_date(postById.getPostCreatedDate());
        dto.setPost_expert(postById.getPostExpert().replaceAll("\\<.*?>", ""));
        dto.setPost_tags(postById.getPostTags());
        dto.setPost_updated_date(postById.getPostUpdatedDate());
        dto.setPost_uri(postById.getPostUri());
        dto.setPost_cat_uri(createPostCatUri(postById.getPostCategory()));
        dto.setPost_views(postById.getPostViews());
        return dto;

    }

    public List<PostsDto> getPostsByCategory(String cat) {
        List<Posts> postsByCat = dao.getPostsByCategory(cat);
        List<PostsDto> postsByCatDto = new ArrayList<>();
        for (Posts posts : postsByCat) {
            PostsDto dto = new PostsDto();
            dto.setPost_id(posts.getPostId());
            dto.setPost_title(posts.getPostTitle());
            dto.setPost_category(posts.getPostCategory());
            dto.setPost_content(posts.getPostContent());
            dto.setPost_created_date(posts.getPostCreatedDate());
            dto.setPost_expert(posts.getPostExpert().replaceAll("\\<.*?>", ""));
            dto.setPost_tags(posts.getPostTags());
            dto.setPost_updated_date(posts.getPostUpdatedDate());
            dto.setPost_cat_uri(createPostCatUri(posts.getPostCategory()));
            dto.setPost_uri(posts.getPostUri());
            dto.setPost_views(posts.getPostViews());
            postsByCatDto.add(dto);
        }
        return postsByCatDto;

    }

    public List<PostsDto> getPopularPosts() {
        List<Posts> popularPosts = dao.getPopularPosts();
        List<PostsDto> popularPostsDto = new ArrayList<>();
        for (Posts posts : popularPosts) {
            PostsDto dto = new PostsDto();
            dto.setPost_id(posts.getPostId());
            dto.setPost_title(posts.getPostTitle());
            dto.setPost_category(posts.getPostCategory());
            dto.setPost_content(posts.getPostContent());
            dto.setPost_created_date(posts.getPostCreatedDate());
            dto.setPost_expert(posts.getPostExpert().replaceAll("\\<.*?>", ""));
            dto.setPost_tags(posts.getPostTags());
            dto.setPost_updated_date(posts.getPostUpdatedDate());
            dto.setPost_uri(posts.getPostUri());
            dto.setPost_cat_uri(createPostCatUri(posts.getPostCategory()));
            dto.setPost_views(posts.getPostViews());
            popularPostsDto.add(dto);
        }
        return popularPostsDto;
    }

    public void setViews(int views, int id) {
        dao.setViews(views, id);
    }

    public String createPostUri(String postName, String badWords) {
        String[] bad = badWords.trim().split(",");
        String[] uri = postName.toLowerCase().trim().replaceAll("[^A-Za-z0-9 ]", "").split("\\s+");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(bad));
        ArrayList<String> urllist = new ArrayList<>(Arrays.asList(uri));
        ArrayList<String> union = new ArrayList<>(list);
        union.addAll(urllist);
        union.removeAll(list);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < union.size(); i++) {
            builder.append(union.get(i));
            if (!(i == union.size() - 1)) {
                builder.append("-");
            }
        }
        return builder.toString();
    }

    //Creating category uri : from java-tutorial to java
    public String createPostCatUri(String uri) {
        String[] urls = uri.split("-");
        String catUri = urls[0];
        return catUri;
    }

}
