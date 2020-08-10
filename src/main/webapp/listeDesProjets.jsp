<%-- 
    Document   : listeDesProjets
    Created on : Aug 6, 2020, 7:39:50 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" import="java.util.*,com.bdeb.gestion_projets.model.Projet" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
        <title> Liste des projets </title>
    </head>
    <body class="bg-secondary">
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
        
        <!-- container principal -->
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> Liste des projets </h1>
                </div>
            </div>
            
            <!-- tableau des projets -->
            <% ArrayList<Projet> listeProjets = (ArrayList<Projet>) request.getAttribute("listeProjets"); %>
            <div>
                <table class="table">
                    <thead>
                        <tr>
                            <th> Nom </th>
                            <th>  </th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for(int i = 0; i < listeProjets.size(); i++) {
                            Projet projet = (Projet) listeProjets.get(i);
                        %>
                        <tr>
                            <td> <%= projet.getNomProjet()%> </td>
                            <td> <a href="EnvoyerDemande?idProjet=<%= projet.getId() %>"> Demander de rejoindre </a> </td>
                        </tr>
                    </tbody>
                    <%
                        }
                        session.invalidate ();
                    %>
                </table>
            </div>
                              
        </div>
    </body>
</html>
