package com.social.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.dao.UserRepository;
import com.social.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author kamal berriga
 *
 */

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User save(User user) {
		return userRepository.saveAndFlush(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User  find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public User findUserById(Long id) {
		return userRepository.findUserById(id);
	}

	public List<User> GetAllUser(){
		return userRepository.findAll();}

}
