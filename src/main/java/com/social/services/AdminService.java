package com.social.services;

import com.social.dao.AdminRepository;
import com.social.entities.Admin;
import com.social.entities.Publication;
import com.social.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    public Admin  find(String userName) {
        return adminRepository.findOneByUsername(userName);
    }
    public Admin find(Long id) {
        return adminRepository.findOne(id);
    }

    public Admin update(String username, Admin admin) {
        admin.setUsername(username);
        return adminRepository.save(admin);}

    public List<Admin> GetAdmin(){
        return adminRepository.findAll();}
}
