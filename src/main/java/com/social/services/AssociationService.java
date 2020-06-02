package com.social.services;

import com.social.dao.AssociationRepository;
import com.social.entities.Association;
import com.social.entities.Publication;
import com.social.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AssociationService {
    @Autowired
   AssociationRepository associationRepository;

    public Association find(Long id) {
        return associationRepository.findOne(id);
    }

    public List<Association> GetAllAssociation(){
        return associationRepository.findAll();}
}
