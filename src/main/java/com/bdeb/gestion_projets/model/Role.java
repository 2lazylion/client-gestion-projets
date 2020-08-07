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

public class Role {

    private static final long serialVersionUID = 1L;
    protected RolePK rolePK;
    private String typeRole;
    private Equipe equipe;
    private Utilisateur utilisateur;

    public Role() {
    }

    public Role(RolePK rolePK) {
        this.rolePK = rolePK;
    }

    public Role(RolePK rolePK, String typeRole) {
        this.rolePK = rolePK;
        this.typeRole = typeRole;
    }

    public Role(int idUtilisateur, int idEquipe) {
        this.rolePK = new RolePK(idUtilisateur, idEquipe);
    }

    public RolePK getRolePK() {
        return rolePK;
    }

    public void setRolePK(RolePK rolePK) {
        this.rolePK = rolePK;
    }

    public String getTypeRole() {
        return typeRole;
    }

    public void setTypeRole(String typeRole) {
        this.typeRole = typeRole;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
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
        hash += (rolePK != null ? rolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.rolePK == null && other.rolePK != null) || (this.rolePK != null && !this.rolePK.equals(other.rolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bdeb.model.Role[ rolePK=" + rolePK + " ]";
    }
    
}
