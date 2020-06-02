package com.social.controller;

import com.social.entities.Admin;
import com.social.entities.Publication;
import com.social.entities.User;
import com.social.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @CrossOrigin()
    @GetMapping("/admins/{username}")
    public Admin find(@PathVariable String username) {
        return adminService.find(username);
    }

    @CrossOrigin()
    @PutMapping("/admins/{username}")
    public Admin update(@PathVariable(name = "username") String username , @RequestBody Admin admin)   {
        return adminService.update(username, admin);
    }

    @CrossOrigin()
    @GetMapping("/admins")
    public List<Admin> GetAdmin(){
        return adminService.GetAdmin();}


}
