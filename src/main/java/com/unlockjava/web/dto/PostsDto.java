/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.dto;

import java.util.Date;

/**
 *
 * @author DIBYA
 */
public class PostsDto {

    private int post_id;
    private String post_title;
    private String post_content;
    private Date post_created_date;
    private Date post_updated_date;
    private String post_category;
    private String post_expert;
    private String post_tags;
    private String post_uri;
    private String post_cat_uri;
    private int post_views;

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public Date getPost_created_date() {
        return post_created_date;
    }

    public void setPost_created_date(Date post_created_date) {
        this.post_created_date = post_created_date;
    }

    public Date getPost_updated_date() {
        return post_updated_date;
    }

    public void setPost_updated_date(Date post_updated_date) {
        this.post_updated_date = post_updated_date;
    }

    public String getPost_category() {
        return post_category;
    }

    public void setPost_category(String post_category) {
        this.post_category = post_category;
    }

    public String getPost_expert() {
        return post_expert;
    }

    public void setPost_expert(String post_expert) {
        this.post_expert = post_expert;
    }

    public String getPost_tags() {
        return post_tags;
    }

    public void setPost_tags(String post_tags) {
        this.post_tags = post_tags;
    }

    public String getPost_uri() {
        return post_uri;
    }

    public void setPost_uri(String post_uri) {
        this.post_uri = post_uri;
    }

    public String getPost_cat_uri() {
        return post_cat_uri;
    }

    public void setPost_cat_uri(String post_cat_uri) {
        this.post_cat_uri = post_cat_uri;
    }

    public int getPost_views() {
        return post_views;
    }

    public void setPost_views(int post_views) {
        this.post_views = post_views;
    }

    @Override
    public String toString() {
        return "PostsDto{" + "post_id=" + post_id + ", post_title=" + post_title + ", post_content=" + post_content + ", post_created_date=" + post_created_date + ", post_updated_date=" + post_updated_date + ", post_category=" + post_category + ", post_expert=" + post_expert + ", post_tags=" + post_tags + ", post_uri=" + post_uri + ", post_cat_uri=" + post_cat_uri + ", post_views=" + post_views + '}';
    }

}
