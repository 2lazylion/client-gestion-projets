/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdeb.gestion_projets.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Edward Cadet
 */
public class Login extends HttpServlet {

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
        // declaration de variables String
        String utilisateur, mdp, mdpCrypt, url;
        
        // objet de la session, elle va conservé le id de l'utilisateur
        HttpSession session = request.getSession();
        
        // TODO: le mettre a zero/null
        int id = 1;
        
        //infos du formulaire
        utilisateur = request.getParameter("utilisateur");
        mdp = request.getParameter("mdp");
        
        // TODO: valider les champs du formulaire
        
        // crypt le mdp
        mdpCrypt = CryptUtils.encrypt(mdp);
        
        // recherche des infos du formulaire dans l'api pour confirmer l'utilisateur
        
        
        // mets les infos dans la session
        session.setAttribute("idUtilisateur", id);
        //session.setAttribute("isLogin", isLogin);
        
        // url pour le redirect
        url = "index.jsp";
        
        // si le user se connecte, le forward ver la gestion de ses projets
        if(id != 0) {
            url = "gestionMesProjets.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        } 
        // if fasle redirect
        RequestDispatcher rd = request.getRequestDispatcher("gestionMesProjets.jsp");
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
