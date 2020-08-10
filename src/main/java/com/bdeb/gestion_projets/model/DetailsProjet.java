package com.bdeb.gestion_projets.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


public class DetailsProjet {

    private String nomProjet;
    private List<Membre> membres;

    public DetailsProjet(){
        
    }
    
    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailsProjet that = (DetailsProjet) o;
        return Objects.equals(nomProjet, that.nomProjet) &&
                Objects.equals(membres, that.membres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomProjet, membres);
    }

    @Override
    public String toString() {
        return "DetailsProjet{" +
                "nomProjet='" + nomProjet + '\'' +
                ", utilisateurs=" + membres +
                '}';
    }

    public static class Membre {
        String nom;
        String email;
        String role;
        
        public Membre() {
            
        }
        
        public Membre(String nom, String email, String role) {
            this.nom = nom;
            this.role = role;
            this.email = email;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Membre that = (Membre) o;
            return Objects.equals(nom, that.nom) &&
                    Objects.equals(role, that.role) && Objects.equals(email, that.email);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nom, role, email);
        }
    }
}
