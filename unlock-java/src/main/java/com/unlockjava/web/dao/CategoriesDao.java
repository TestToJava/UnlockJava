/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import com.unlockjava.web.model.Categories;
import com.unlockjava.web.repository.CategoriesRepository;

/**
 *
 * @author DIBYA
 */
@Repository
public class CategoriesDao {

    @Autowired
    private CategoriesRepository catRepository;

    public List<Categories> getAllCategories() {

        int count = (int) catRepository.count();
        Page<Categories> categories = catRepository.findAll(new PageRequest(0, count));
        return categories.getContent();

    }

}
