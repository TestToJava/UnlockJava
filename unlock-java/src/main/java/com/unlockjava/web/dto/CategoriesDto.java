/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.dto;

/**
 *
 * @author DIBYA
 */
public class CategoriesDto {

    private int catId;
    private String catName;
    private String catUrl;

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatUrl() {
        return catUrl;
    }

    public void setCatUrl(String catUrl) {
        this.catUrl = catUrl;
    }

    @Override
    public String toString() {
        return "CategoriesDto{" + "catId=" + catId + ", catName=" + catName + ", catUrl=" + catUrl + '}';
    }

}
