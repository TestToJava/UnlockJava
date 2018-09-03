/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unlockjava.web.dao.CategoriesDao;
import com.unlockjava.web.dto.CategoriesDto;
import com.unlockjava.web.model.Categories;

/**
 *
 * @author DIBYA
 */
@Service
public class CategoryService {

    @Autowired
    private CategoriesDao catDao;

    public List<CategoriesDto> getAllCategories() {
        List<Categories> categories = catDao.getAllCategories();
        List<CategoriesDto> categoriesDtoList = new ArrayList<>();
        for (Categories cat : categories) {
            CategoriesDto dto = new CategoriesDto();
            dto.setCatId(cat.getCatId());
            dto.setCatName(cat.getCatName());
            dto.setCatUrl(cat.getCatUrl());
            categoriesDtoList.add(dto);
        }

        return categoriesDtoList;
    }

}
