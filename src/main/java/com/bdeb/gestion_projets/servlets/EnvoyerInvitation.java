/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.servlets;

import com.bdeb.gestion_projets.model.Demande;
import com.bdeb.gestion_projets.model.DemandePK;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

/**
 *
 * @author Edward Cadet
 */
public class EnvoyerInvitation extends HttpServlet {
    //client pour communiquer avec le API
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
        // declaration des variables
        String url, destinataire;
        int idProjet, idUtilisateur;
        
        // Prendre le idProjet de listeDesProjets.jsp
        idProjet = Integer.parseInt(request.getParameter("idProjet"));
        
        // TODO: prendre les infos de l'utilisateur dpour le destinataire
        idUtilisateur = Integer.parseInt(request.getParameter("idUtilisateur"));
        destinataire = request.getParameter("destinataire");
        
        // lien pour a requete api
        String queryString = Config.BASE_URI + "demandes" ;
        
        // creer la cle de la demande
        DemandePK dpk = new DemandePK(idUtilisateur, idProjet, destinataire);
        
        //creer la nouvelle demande
        Demande nouvelleDemande = new Demande(dpk);
        
        // post au API TODO: rajoute response.getStatus pour verfier si il est cree
        Response responseApi = client.target(queryString)
                .request()
                .post(Entity.json(nouvelleDemande));
        
        // ferme l'objet responseApi
        responseApi.close();
        
        // adresse ou on va renvoyer la requete
        url = "/demandeConfirmation.jsp";
        
        // TODO: response.getStatus == 204? a ete envoye : n'a pas ete envoye
        request.setAttribute("msgConfirmation", "votre invitation a ete envoye");
        
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
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
