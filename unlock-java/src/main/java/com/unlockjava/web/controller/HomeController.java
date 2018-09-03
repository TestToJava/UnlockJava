package com.unlockjava.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unlockjava.web.dto.CategoriesDto;
import com.unlockjava.web.dto.PostsDto;
import com.unlockjava.web.service.CategoryService;
import com.unlockjava.web.service.PostsService;

@Controller
public class HomeController {

    @Autowired
    private PostsService service;
    @Autowired
    private CategoryService catService;
    @Value("${application.title}")
    private String title;
    @Value("${application.desc}")
    private String desc; 
    @Value("${application.auther}")
    private String auther;
    @Value("${application.keywords}")
    private String keywords;
    
    
    @RequestMapping({"/"})
    public String getIndexPage(Model model) {

        List<PostsDto> latestPosts = service.getLatestPostsForHome();
        model.addAttribute("latest", latestPosts);
        List<CategoriesDto> categories = catService.getAllCategories();
        model.addAttribute("categories", categories);
        List<PostsDto> popularPost = service.getPopularPosts();
        model.addAttribute("popular", popularPost);
        model.addAttribute("title", title);
        model.addAttribute("desc", desc);
        model.addAttribute("auther", auther);
        model.addAttribute("keywords", keywords);

        return "home";
    }

    @RequestMapping({"/home", "/index.htm", "index.html"})
    public String getIndex() {
        return "redirect:/";
    }

}
