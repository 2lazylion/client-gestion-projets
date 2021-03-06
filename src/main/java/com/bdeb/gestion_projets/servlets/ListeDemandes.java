/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.servlets;

import com.bdeb.gestion_projets.model.Demande;
import com.bdeb.gestion_projets.model.DemandePK;
import com.bdeb.gestion_projets.model.Projet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Edward Cadet
 */
public class ListeDemandes extends HttpServlet {
    
    // client pour communiquer avec le API
    private Client client = ClientBuilder.newClient();
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // id de l'utilisateur
        int idUtilisateur = 1;
        // requete pour le API synchrone :(
        String queryString = Config.BASE_URI + "demandes?idUtilisateur=" + idUtilisateur; //+ String.valueOf(id);
        GenericType<ArrayList<Demande>> genericDemande = new GenericType<ArrayList<Demande>>() {};
        
        try{
            // liste des demandes se l'utilisateurs
            ArrayList<Demande> mesDemandes = client
              .target(queryString)
              .request(MediaType.APPLICATION_JSON)
              .get(genericDemande);
            
            //liste des noms de projets
            /*
            for(Demande demande : mesDemandes) {
                
            }
            */
            
            // url a envoyer la liste
            String url = "listeDemandes.jsp";

            // envoie la liste a la page web
            request.setAttribute("mesDemandes", mesDemandes);

            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
            
        } catch (NotFoundException ex ) {
            ex.printStackTrace();
        }
        
        /*
        // adresse ou on va renvoyer la requete
        String url = "/listeDemandes.jsp";
        
        ArrayList<Demande> mesDemandes = new ArrayList<Demande>();
        mesDemandes.add(new Demande(new DemandePK() , new Date(2020,8,6), "en attente"));
        mesDemandes.add(new Demande(new DemandePK() , new Date(2020,8,5), "en attente"));
        mesDemandes.add(new Demande(new DemandePK() , new Date(2020,8,4), "en attente"));
        
        // envoie la liste a la page web
        request.setAttribute("mesDemandes", mesDemandes);
        
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
        */
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
