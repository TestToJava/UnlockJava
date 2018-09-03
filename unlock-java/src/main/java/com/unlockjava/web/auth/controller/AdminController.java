/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.auth.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unlockjava.web.auth.model.Admin;
import com.unlockjava.web.auth.service.AdminService;
import com.unlockjava.web.dto.CategoriesDto;
import com.unlockjava.web.dto.PostsDto;
import com.unlockjava.web.service.CategoryService;
import com.unlockjava.web.service.PostsService;

/**
 *
 * @author DIBYA
 */
@Controller
public class AdminController {

    @Autowired
    private PostsService service;
    @Autowired
    private AdminService adminService;
    @Autowired
    private CategoryService catService;

    @RequestMapping("/cp-login")
    public String login(Model model) {
        model.addAttribute("admin", new Admin());

        return "cp-login";
    }
    
      @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/cp-login";

    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String accessControlPannelGet(HttpSession session, Model model) {
        Admin returnedAdmin = (Admin) session.getAttribute("admin");

        List<PostsDto> allPosts = service.getAllPostsForCp();
        if (returnedAdmin != null) {
            model.addAttribute("posts", allPosts);
            model.addAttribute("count", allPosts.size());
            model.addAttribute("views", getAllViews(allPosts));
            return "dashboard/home";
        }
        return "redirect:/cp-login";

    }
 
    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public String accessControlPannel(@ModelAttribute("login") Admin admin, HttpSession session, Model model) {
        Admin returnedAdmin = adminService.findByUsernameAndPassword(admin.getUsername());
        List<PostsDto> allPosts = service.getAllPostsForCp();
        model.addAttribute("posts", allPosts);
        model.addAttribute("count", allPosts.size());
        session.setAttribute("admin", returnedAdmin);
        model.addAttribute("views", getAllViews(allPosts));
        if (session.getAttribute("admin") != null) {
            return "dashboard/home";
        }
        return "cp-login";

    }

    @RequestMapping(value = "/dashboard/new-post", method = RequestMethod.GET)
    public String addPostFrom(@ModelAttribute("post") PostsDto dto, Model model, HttpSession session) {
        model.addAttribute("title", "Add New Post");
        List<CategoriesDto> categories = catService.getAllCategories();
        model.addAttribute("post", new PostsDto());
        model.addAttribute("categories", categories);
        if (session.getAttribute("admin") != null) {
            return "dashboard/add-post-form";
        } else {
            return "redirect:/cp-login";

        }
    }

    @RequestMapping(value = "/dashboard/add-post", method = RequestMethod.POST)
    public String addPost(@ModelAttribute("post") PostsDto dto, HttpSession session) {
        service.addPost(dto);

        if (session.getAttribute("admin") != null) {
            return "dashboard/home";
        } else {
            return "redirect:/cp-login";

        }
    }

    @RequestMapping(value = "/dashboard/edit-post/{id}", method = RequestMethod.GET)
    public String editPost(@ModelAttribute("post") PostsDto dto, @PathVariable("id") Integer id, HttpSession session, Model model) {
        PostsDto post = service.getPostsById(id);
        List<CategoriesDto> categories = catService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("post", post);
        if (session.getAttribute("admin") != null) {
            return "dashboard/edit-post-form";
        } else {
            return "redirect:/cp-login";

        }
    }

    @RequestMapping(value = "/dashboard/update-post", method = RequestMethod.POST)
    public String updatePost(@ModelAttribute("post") PostsDto dto, HttpSession session, Model model) {
        System.out.println(dto);

        service.updatePost(dto);
        if (session.getAttribute("admin") != null) {
            return "redirect:/dashboard";
        } else {
            return "redirect:/cp-login";
        }
    }

    public int getAllViews(List<PostsDto> posts) {

        int viewCount = 0;
        for (PostsDto post : posts) {
            viewCount += post.getPost_views();
        }
        return viewCount;
    }

}
