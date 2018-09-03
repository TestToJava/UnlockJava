/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlockjava.web.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 *
 * @author DIBYA
 */
@Service
public class SecurityService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;

    public String findLoggedInUser() {
        Object context = SecurityContextHolder.getContext().getAuthentication().getDetails();

        if (context instanceof UserDetails) {
            return ((UserDetails) context).getUsername();
        }
        return null;
    }

    public void autoLogin(String username, String password) {

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(password, userDetails, userDetails.getAuthorities());
        authenticationManager.authenticate(userAuth);

        if (userAuth.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(userAuth);
            //log for Auto login Success
        }

    }
}
