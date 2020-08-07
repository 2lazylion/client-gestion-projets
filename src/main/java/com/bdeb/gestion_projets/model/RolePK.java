/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.model;


/**
 *
 * @author Lokman Boukhoulda<Lokky@lokmanboukhoulda.com>
 */

public class RolePK {

    
    private int idUtilisateur;
    private int idEquipe;

    public RolePK() {
    }

    public RolePK(int idUtilisateur, int idEquipe) {
        this.idUtilisateur = idUtilisateur;
        this.idEquipe = idEquipe;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUtilisateur;
        hash += (int) idEquipe;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePK)) {
            return false;
        }
        RolePK other = (RolePK) object;
        if (this.idUtilisateur != other.idUtilisateur) {
            return false;
        }
        if (this.idEquipe != other.idEquipe) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bdeb.model.RolePK[ idUtilisateur=" + idUtilisateur + ", idEquipe=" + idEquipe + " ]";
    }
    
}
