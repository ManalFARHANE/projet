package com.social.entities;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Publication")
@Scope("session")
public class Publication {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long id_benevol;
    private String ville ;
    private String titre;
    private  String type;
    private String img;
    private  String description;
    private  String etat ;
    private long id_association;
    private Date date;

    public Publication(){

    }


    public Publication(long id_benevol, String ville, String titre, String type, String img, String description, String etat, Date date) {
        this.id_benevol = id_benevol;
        this.ville = ville;
        this.titre = titre;
        this.type = type;
        this.img = img;
        this.description = description;
        this.etat = etat;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", id_benevol=" + id_benevol +
                ", ville='" + ville + '\'' +
                ", titre='" + titre + '\'' +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                ", description='" + description + '\'' +
                ", etat='" + etat + '\'' +
                ", id_association=" + id_association +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId_association() {
        return id_association;
    }

    public void setId_association(long id_association) {
        this.id_association = id_association;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public long getId_benevol() {
        return id_benevol;
    }

    public void setId_benevol(long id_benevol) {
        this.id_benevol = id_benevol;
    }
}
