/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.servlets;

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
import javax.servlet.http.HttpSession;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Edward Cadet
 */
public class listeProjets extends HttpServlet {

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
        // session de la requete
        HttpSession session = request.getSession();
        
        // requete pour le API synchrone :(
        String queryString = Config.BASE_URI + "projets/tout"; //+ String.valueOf(id);
        GenericType<ArrayList<Projet>> genericMesProjets = new GenericType<ArrayList<Projet>>() {};
        
        try{
            ArrayList<Projet> listeProjets = client
              .target(queryString)
              .request(MediaType.APPLICATION_JSON)
              .get(genericMesProjets);
        
             // url a envoyer la liste
        String url = "/listeDesProjets.jsp";
        
        // envoie la liste a la page web
        request.setAttribute("listeProjets", listeProjets);
        
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
            
        } catch (NotFoundException ex ) {
            ex.printStackTrace();
        }
        
        /*
        // Mock d'une liste de projet
        ArrayList<Projet> listeProjets = new ArrayList<Projet>();
        Projet projetMock1 = new Projet(1, "Projet1", new Date(2020,8,6));
        Projet projetMock2 = new Projet(2, "Projet2", new Date(2020,8,6));
        Projet projetMock3 = new Projet(3, "Projet3", new Date(2020,8,6));
        Projet projetMock4 = new Projet(4, "Projet4", new Date(2020,8,6));
        Projet projetMock5 = new Projet(5, "Projet5", new Date(2020,8,6));
        
        listeProjets.add(projetMock1);
        listeProjets.add(projetMock2);
        listeProjets.add(projetMock3);
        listeProjets.add(projetMock4);
        listeProjets.add(projetMock5);
        
        // url a envoyer la liste
        String url = "/listeDesProjets.jsp";
        
        // envoie la liste a la page web
        request.setAttribute("listeProjets", listeProjets);
        
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
