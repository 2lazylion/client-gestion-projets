<%-- 
    Document   : index
    Created on : Aug 6, 2020, 9:54:13 AM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- TODO: I18n -->
        <title> Gestion de projets </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
    </head>
    <body>
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />     
        
        <!-- container principal -->
        <div class="container">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3">Connexion</h1>
                </div>
            </div>
            
            <!-- if not connected, include connexion else gestion de projet ? -->
            <!-- formulaire de login -->
            <jsp:include page="connexion.jsp" /> 
            
        </div>
    </body>
</html>

