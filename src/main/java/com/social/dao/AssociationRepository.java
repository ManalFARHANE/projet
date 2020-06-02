package com.social.dao;

import com.social.entities.Association;
import com.social.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {
}
