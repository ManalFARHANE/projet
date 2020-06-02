package com.social.controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import com.social.dao.BenevolRepository;
import com.social.dao.UserRepository;
import com.social.entities.Association;
import com.social.entities.Benevol;
import com.social.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.social.util.CustomErrorType;
import com.social.entities.User;

@RestController
//@RequestMapping("account")
public class AccountController {

	public static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private UserService userService;





	// request method to create a new account by a guest
	/*@CrossOrigin
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		if (userService.find(newUser.getUsername()) != null) {
			logger.error("username Already exist " + newUser.getUsername());
			return new ResponseEntity(
					new CustomErrorType("user with username " + newUser.getUsername() + "already exist "),
					HttpStatus.CONFLICT);
		}
		newUser.setRole("USER");

		return new ResponseEntity<User>(userService.save(newUser), HttpStatus.CREATED);
	}*/

	// this is the login api/service
	@CrossOrigin
	@RequestMapping("/login")
	public Principal user(Principal principal) {
		logger.info("user logged " + principal);
		return principal;
	}

	@CrossOrigin
	@GetMapping("/")
	public String log() {
		return "authenticated";
	}


	@CrossOrigin
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> GetAllUser() {
		return userService.GetAllUser();
	}
@CrossOrigin()
@GetMapping("/users/{username}")
public User find(@PathVariable String username) {
	return userService.find(username);
}
	@CrossOrigin()
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable long id) {
		return userService.findUserById(id);
	}




}
//npm install axios
