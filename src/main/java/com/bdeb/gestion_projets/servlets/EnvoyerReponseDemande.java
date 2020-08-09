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
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Edward Cadet
 */
public class EnvoyerReponseDemande extends HttpServlet {
    
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
        response.setContentType("text/html;charset=UTF-8");
        //declaration de variables
        String url, test, reponseDemande, queryString, destinataire;
        int idUtilisateur, idProjet;
        Response responseApi;
        
        // prend les parametres de la demande dans la requete
        idUtilisateur = Integer.parseInt(request.getParameter("idUtilisateur"));
        idProjet = Integer.parseInt(request.getParameter("idUtilisateur"));
        destinataire = request.getParameter("destinataire");
        
        // creer la cle de la demande
        DemandePK dpk = new DemandePK(idUtilisateur, idProjet, destinataire);
        
       
        
        // adresse ou on va renvoyer la requete
        url = "/demandeConfirmation.jsp";
        test = "testAttribute";
        reponseDemande = request.getParameter("reponseDemande");
        
        // requete pour le API pour aller chercher la liste des demandes
        queryString = Config.BASE_URI + "demandes?idUtilisateur=" + idUtilisateur; //+ String.valueOf(id);
        GenericType<ArrayList<Demande>> genericDemande = new GenericType<ArrayList<Demande>>() {};
        
        try{
            // si la demande a été accepté
            if(reponseDemande.equals("accepter")) {
                // creer la demande avec l'état accepté
                Demande demandeAccepte = new Demande(dpk, new Date(), "ACCEPTEE");

                // post au API TODO: rajoute response.getStatus pour verfier si il est cree
                responseApi = client.target(queryString)
                        .request()
                        .post(Entity.json(demandeAccepte));

                // ferme l'objet responseApi
                responseApi.close();
                
                // confirme a l'utilisateur 
                request.setAttribute("msgConfirmation", "vous avez " + reponseDemande + " de rejoindre le projet");
            } else {
                // creer la demande avec l'état accepté
                Demande demandeRefuse = new Demande(dpk, new Date(), "ANNULE");

                // post au API TODO: rajoute response.getStatus pour verfier si il est cree
                responseApi = client.target(queryString)
                        .request()
                        .post(Entity.json(demandeRefuse));

                // ferme l'objet responseApi
                responseApi.close();
                
                // confirme a l'utilisateur
                request.setAttribute("msgConfirmation", "vous avez " + reponseDemande + " de rejoindre le projet");
            }
        } catch (NotFoundException ex ) {
            ex.printStackTrace();
        }
        
        
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
