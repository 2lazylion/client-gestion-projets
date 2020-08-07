/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.model;


import java.util.Date;

/**
 *
 * @author Lokman Boukhoulda <boukhoulda.lokman at gmail.com>
 */

public class Demande {

    private static final long serialVersionUID = 1L;
    protected DemandePK demandePK;
    private Date dateDemande;
    private String etatDemande;

    // 
    void setDateCreation() {
        if (this.dateDemande == null) {
            this.dateDemande = new Date();
        }
    }
    
    private Projet projet;
    private Utilisateur utilisateur;

    public Demande() {
    }

    public Demande(DemandePK demandePK) {
        this.demandePK = demandePK;
    }

    public Demande(DemandePK demandePK, Date dateDemande, String etatDemande) {
        this.demandePK = demandePK;
        this.dateDemande = dateDemande;
        this.etatDemande = etatDemande;
    }

    public Demande(int idUtilisateur, int idProjet, String destinataire) {
        this.demandePK = new DemandePK(idUtilisateur, idProjet, destinataire);
    }

    public DemandePK getDemandePK() {
        return demandePK;
    }

    public void setDemandePK(DemandePK demandePK) {
        this.demandePK = demandePK;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public String getEtatDemande() {
        return etatDemande;
    }

    public void setEtatDemande(String etatDemande) {
        this.etatDemande = etatDemande;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (demandePK != null ? demandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.demandePK == null && other.demandePK != null) || (this.demandePK != null && !this.demandePK.equals(other.demandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bdeb.model.Demande[ demandePK=" + demandePK + " ]";
    }
    
}
