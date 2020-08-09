/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.servlets;

import com.bdeb.gestion_projets.model.Utilisateur;
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
public class CreationUtilisateur extends HttpServlet {
    
    Client client = ClientBuilder.newClient();
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
        
        // lien pour a requete api
        String queryString = Config.BASE_URI + "utilisateurs";
        
        // info pour le nouveaau utilisateur
        String nomUtilisateur = request.getParameter("nomUtilisateur");
        String email = request.getParameter("email");
        // TODO: confirmer mdp js?
        String mdp = request.getParameter("mdp");
        
        // creation du nouveau projet
        Utilisateur nouveauUtilisateur = new Utilisateur();
        nouveauUtilisateur.setNom(nomUtilisateur);
        nouveauUtilisateur.setMotDePasse(mdp);
        nouveauUtilisateur.setEmail(email);
        
        // post au API
        Response responseApi = client.target(queryString)
                .request()
                .post(Entity.json(nouveauUtilisateur));
        
        // ferme l'objet responseApi
        responseApi.close();
        
        // url a envoyer la liste
        String url = "/index.jsp";
        
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
