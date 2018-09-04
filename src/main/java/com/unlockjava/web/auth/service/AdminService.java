/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unlockjava.web.auth.model.Admin;
import com.unlockjava.web.auth.repository.AdminRepository;

/**
 *
 * @author DIBYA
 */
@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;
    
    
     public Admin findByUsernameAndPassword(String username) {
        return adminRepository.findByUsername(username);
    }

}
