/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unlockjava.web.auth.model.Admin;

/**
 *
 * @author DIBYA
 */
public interface AdminRepository extends JpaRepository<Admin, String>{
    
    Admin findByUsername(String username);
    
}
