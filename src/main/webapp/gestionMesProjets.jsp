<%-- 
    Document   : gestionProjets
    Created on : Aug 6, 2020, 10:55:06 AM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" import="java.util.*,com.bdeb.gestion_projets.model.Projet" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
        <title> Gestion de mes projets </title>
    </head>
    <body class="bg-secondary">
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
        
        <!-- container principal -->
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> Gestion de mes projets </h1>
                </div>
            </div>
            
            <!-- tableau des projets -->
            <% ArrayList<Projet> mesProjets = (ArrayList<Projet>) request.getAttribute("mesProjets"); %>
            <div>
                <table class="table">
                    <thead>
                        <tr>
                            <th> Nom </th>
                            <th>  </th>
                            <th>  </th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for(int i = 0; i < mesProjets.size(); i++) {
                            Projet projet = (Projet) mesProjets.get(i);                
                        %>
                        <tr>
                            <td> <%= projet.getNomProjet()%> </td>
                            <td> <a href="DetailProjet?id=<%= projet.getId()%>"> Detail </a> 
                            </td>
                            <td><a href="listeUtilisateurs?idProjet=<%= projet.getId()%>"> Envoyer une invitation </a></td>
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
