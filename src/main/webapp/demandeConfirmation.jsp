<%-- 
    Document   : demandeConfirmation
    Created on : Aug 7, 2020, 10:49:16 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
        <title> Confirmation </title>
    </head>
    <body class="bg-secondary">
         <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
         <!-- container principal -->
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> Confirmation </h1>
                </div>
            </div>
            
            <h3> ${ msgConfirmation } </h3>
            
                             
        </div>
    </body>
</html>
