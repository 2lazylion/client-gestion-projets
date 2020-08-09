/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.model;

import java.util.Date;
import java.util.List;


/**
 *
 * @author Lokman Boukhoulda<Lokky@lokmanboukhoulda.com>
 */

public class Projet {
   
    private String nomProjet;
    private Date dateCreation;
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Equipe idEquipe;
    private List<Demande> demandeList;
    
    public Projet() {
    }

    public Projet(Integer id) {
        this.id = id;
    }

    public Projet(Integer id, String nomProjet, Date dateCreation) {
        this.id = id;
        this.nomProjet = nomProjet;
        this.dateCreation = dateCreation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Equipe getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Equipe idEquipe) {
        this.idEquipe = idEquipe;
    }

    public List<Demande> getDemandeList() {
        return demandeList;
    }

    public void setDemandeList(List<Demande> demandeList) {
        this.demandeList = demandeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projet)) {
            return false;
        }
        Projet other = (Projet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bdeb.model.Projet[ id=" + id + " ]";
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
}
