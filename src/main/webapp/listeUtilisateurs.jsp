<%-- 
    Document   : listeUtilisateurs
    Created on : Aug 7, 2020, 8:23:20 PM
    Author     : Edward Cadet
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" import="java.util.*,com.bdeb.gestion_projets.model.Utilisateur" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
        <title> Envoyer une invitation  </title>
    </head>
    <body class="bg-secondary">
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
        
        <!-- Si on recoit une confirmation du servlet, fait apparaitre un popup de confirmation? -->
        <c:if test="${ confirmation }" >
            <script>
                alert('Vous avez envoyé l\'invitation');
            </script>
        </c:if>
            
        <!-- container principal -->
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> Liste des utilisateurs </h1>
                </div>
            </div>
            
            
            <!-- tableau des projets -->
            <% ArrayList<Utilisateur> listeUtilisateurs = (ArrayList<Utilisateur>) request.getAttribute("utilisateurs"); %>
            <div>
                <table class="table">
                    <thead>
                        <tr>
                            <th> Nom </th>
                            <th>  </th>
                        </tr>
                    </thead>
                    <tbody>                     
                        <% for(int i = 0; i < listeUtilisateurs.size(); i++) {
                            Utilisateur utilisateur = (Utilisateur) listeUtilisateurs.get(i);
                        %>
                        <tr>
                            <td> <%= utilisateur.getNom()%> </td>
                            <td> <a href="EnvoyerInvitation?idProjet=<%= request.getParameter("idProjet") %>&idUtilisateur=<%= utilisateur.getId()%>&destinataire=<%= utilisateur.getEmail()%>"> Inviter </a> </td> 
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
