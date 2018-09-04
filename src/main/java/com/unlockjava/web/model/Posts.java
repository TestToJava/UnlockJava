/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DIBYA
 */
@Entity
@Table(name = "POSTS")
public class Posts implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POST_ID")
    private int postId;
    @Column(name = "POST_TITLE")
    private String postTitle;
    @Column(name = "POST_CONTENT")
    private String postContent;
    @Column(name = "POST_DATE")
    private Date postCreatedDate;
    @Column(name = "POST_MODIFIED_DATE")
    private Date postUpdatedDate;
    @Column(name = "POST_CATEGORY")
    private String postCategory;
    @Column(name = "POST_EXPERT")
    private String postExpert;
    @Column(name = "POST_URI")
    private String postUri;
    @Column(name = "POST_TAGS")
    private String postTags;
    @Column(name = "POST_VIEWS")
    private int postViews;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getPostCreatedDate() {
        return postCreatedDate;
    }

    public void setPostCreatedDate(Date postCreatedDate) {
        this.postCreatedDate = postCreatedDate;
    }

    public Date getPostUpdatedDate() {
        return postUpdatedDate;
    }

    public void setPostUpdatedDate(Date postUpdatedDate) {
        this.postUpdatedDate = postUpdatedDate;
    }

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory;
    }

    public String getPostExpert() {
        return postExpert;
    }

    public void setPostExpert(String postExpert) {
        this.postExpert = postExpert;
    }

    public String getPostUri() {
        return postUri;
    }

    public void setPostUri(String postUri) {
        this.postUri = postUri;
    }

    public String getPostTags() {
        return postTags;
    }

    public void setPostTags(String postTags) {
        this.postTags = postTags;
    }

    public int getPostViews() {
        return postViews;
    }

    public void setPostViews(int postViews) {
        this.postViews = postViews;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.postId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posts other = (Posts) obj;
        if (this.postId != other.postId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Posts{" + "postId=" + postId + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postCreatedDate=" + postCreatedDate + ", postUpdatedDate=" + postUpdatedDate + ", postCategory=" + postCategory + ", postExpert=" + postExpert + ", postUri=" + postUri + ", postTags=" + postTags + ", postViews=" + postViews + '}';
    }

}
