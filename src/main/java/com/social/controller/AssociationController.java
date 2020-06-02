package com.social.controller;

import com.social.entities.Association;
import com.social.services.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssociationController {
    @Autowired
    private AssociationService associationService;

    @CrossOrigin()
    @GetMapping("/associations/{id}")
    public Association find(@PathVariable Long id) {
        return associationService.find(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/associations", method = RequestMethod.GET)
    public List<Association> GetAllAssociation(){
        return associationService.GetAllAssociation();}
}
