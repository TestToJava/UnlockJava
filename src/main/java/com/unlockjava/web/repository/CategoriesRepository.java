/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.unlockjava.web.model.Categories;

/**
 *
 * @author DIBYA
 */
public interface CategoriesRepository extends CrudRepository<Categories, Integer>{

    Page<Categories> findAll(Pageable pageable);

    
}
