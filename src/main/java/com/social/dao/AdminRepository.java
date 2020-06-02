package com.social.dao;

import com.social.entities.Admin;
import com.social.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    public Admin findOneByUsername(String username);
}
