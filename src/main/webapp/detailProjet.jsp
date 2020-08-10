<%-- 
    Document   : gestionProjet
    Created on : Aug 6, 2020, 7:39:10 PM
    Author     : Edward Cadet
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- TODO: I18n -->
        <title> detail du projet ${ detailProjet.nomProjet } </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
    </head>
    <body class="bg-secondary">
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />     

        <!-- container principal -->
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> detail du projet ${ detailProjet.nomProjet } </h1>
                </div>
            </div>
                <div>
                    <h2>Date de création : <fmt:formatDate pattern = "yyyy-MM-dd" value="${detailProjet.dateCreation}"/></h2>
                </div>
            <div>
                <h2>Les membres</h2>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>Email</th>
                        <th>Nom</th>
                        <th> Role</th>
                    </tr>
                    </thead>
                <c:forEach var="membre" items="${detailProjet.membres}" >
                    <tr>
                        <td><c:out value="${membre.email}"/></td>
                        <td><c:out value="${membre.nom}"/></td>
                        <td><c:out value="${membre.role}"/></td>
                </tr>
                </c:forEach>
                    </table>
            </div>
            <div>
                <a href="GestionProjets">Retour vers liste projets</a>
            </div>




        </div>
    </body>
</html>
