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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.unlockjava.web.dto.CategoriesDto;
import com.unlockjava.web.dto.PostsDto;
import com.unlockjava.web.service.CategoryService;
import com.unlockjava.web.service.PostsService;

/**
 *
 * @author DIBYA
 */
@Controller
public class CategoriesController {

    @Autowired
    private CategoryService catService;
    @Autowired
    private PostsService service;

    @RequestMapping(value = "/cat.htm", method = RequestMethod.GET)
    public String viewPost(@RequestParam("uri") String uri, Model model) {

        List<PostsDto> posts = service.getPostsByCategory(uri);
        model.addAttribute("posts", posts);

        String title = uri.replace('-', ' ');
        model.addAttribute("title", title);

        String[] catArr = title.split("\\s");
        String cat = catArr[0];
        model.addAttribute("cat", cat.toLowerCase());

        List<CategoriesDto> categories = catService.getAllCategories();
        model.addAttribute("categories", categories);

        List<PostsDto> popularPost = service.getPopularPosts();
        model.addAttribute("popular", popularPost);

        return "postsbycat";
    }

}
