<%-- 
    Document   : gestionProjet
    Created on : Aug 6, 2020, 7:39:10 PM
    Author     : Edward Cadet
--%>

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
            
             
            
        </div>
    </body>
</html>
