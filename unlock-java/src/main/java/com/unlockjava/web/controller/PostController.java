/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unlockjava.web.dto.CategoriesDto;
import com.unlockjava.web.dto.PostsDto;
import com.unlockjava.web.service.CategoryService;
import com.unlockjava.web.service.PostsService;

/**
 *
 * @author DIBYA
 */
@Controller
public class PostController {

    @Autowired
    private PostsService service;
    @Autowired
    private CategoryService catService;

    @RequestMapping(value = "/post/{cat}/{uri}", method = RequestMethod.GET)
    public String viewPost(@PathVariable("cat") String cat, @PathVariable("uri") String uri, Model model) {

        PostsDto post = service.getPostByUri(uri);

        int views = post.getPost_views();
        int id = post.getPost_id();
        int count = countViews(views);
        service.setViews(count, id);
        
        model.addAttribute("post", post);
        model.addAttribute("title", post.getPost_title());

        List<CategoriesDto> categories = catService.getAllCategories();
        model.addAttribute("categories", categories);

        List<PostsDto> popularPost = service.getPopularPosts();
        model.addAttribute("popular", popularPost);

        return "single";
    }

    public int countViews(int views) {
        views++;
        return views;
    }
}
