package com.social.controller;

import com.social.entities.Admin;
import com.social.entities.Benevol;
import com.social.entities.User;
import com.social.services.BenevolService;
import com.social.util.CustomErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BenevolController {
    public static final Logger logger = LoggerFactory.getLogger(BenevolController.class);
    @Autowired
    private BenevolService benevolService;


    @CrossOrigin
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody Benevol newUser) {
        if (benevolService.find(newUser.getLogin()) != null) {
            logger.error("username Already exist " + newUser.getLogin());
            return new ResponseEntity(
                    new CustomErrorType("user with username " + newUser.getLogin() + "already exist "),
                    HttpStatus.CONFLICT);
        }
        return new ResponseEntity<Benevol>(benevolService.save(newUser), HttpStatus.CREATED);
    }

    @CrossOrigin()
    @GetMapping("/benevols")
    public List<Benevol> GetAllBenevol(){
        return benevolService.GetAllBenevol();}

   @CrossOrigin()
    @GetMapping("/benevols/{login}")
    public Benevol find(@PathVariable String login) { return benevolService.find(login);
    }
    @CrossOrigin()
    @GetMapping("/benevol/{id}")
    public Benevol find(@PathVariable int id) { return benevolService.find(id);
    }
    @CrossOrigin()
    @PutMapping("/benevol/{id}")
    public Benevol update(@PathVariable(name = "id") int id , @RequestBody Benevol benevol)   {
        return benevolService.update(id, benevol);
    }
}
