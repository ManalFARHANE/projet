package com.social.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;



@Entity
@Table(name="Association")
@Scope("session")
public class Association {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id_asso ;
    private  String login;
    private  String mdp;
    private  String Adresse;
    private  String nom;
    private  String Description;
    private  String email;
    private  int Tel;
    private  int Fax;

    public Association(){};

    public Association(long id_asso, String login, String mdp, String adresse, String nom, String description, String email, int tel, int fax) {
        this.id_asso = id_asso;
        this.login = login;
        this.mdp = mdp;
        Adresse = adresse;
        this.nom = nom;
        Description = description;
        this.email = email;
        Tel = tel;
        Fax = fax;
    }
    public long getId_asso() {
        return id_asso;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return Description;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return Tel;
    }

    public int getFax() {
        return Fax;
    }

    public void setId_asso(long id_asso) {
        this.id_asso = id_asso;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public void setFax(int fax) {
        Fax = fax;
    }
}
