/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Lokman Boukhoulda <boukhoulda.lokman at gmail.com>
 */

public class DemandePK {

    
    private int idUtilisateur;
    
    private int idProjet;
    
    private String destinataire;

    public DemandePK() {
    }

    public DemandePK(int idUtilisateur, int idProjet, String destinataire) {
        this.idUtilisateur = idUtilisateur;
        this.idProjet = idProjet;
        this.destinataire = destinataire;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUtilisateur;
        hash += (int) idProjet;
        hash += (destinataire != null ? destinataire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DemandePK)) {
            return false;
        }
        DemandePK other = (DemandePK) object;
        if (this.idUtilisateur != other.idUtilisateur) {
            return false;
        }
        if (this.idProjet != other.idProjet) {
            return false;
        }
        if ((this.destinataire == null && other.destinataire != null) || (this.destinataire != null && !this.destinataire.equals(other.destinataire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bdeb.model.DemandePK[ idUtilisateur=" + idUtilisateur + ", idProjet=" + idProjet + ", destinataire=" + destinataire + " ]";
    }
    
}
