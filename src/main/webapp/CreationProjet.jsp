<%-- 
    Document   : CreationProjet
    Created on : Aug 6, 2020, 7:40:40 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
        
        <!-- formulaire de creation d'un nouveau projet -->
            <div class="row">
                <div class=" col-lg-10 offset-2">
                    <form action="">
                        <div class="form-group">
                            <label for="nomProjet"> Nom du projet </label>
                            <input type="text" class="form-control col-7" id="nomProjet" placeholder="nom du projet">
                            <!--  div class="valid-feedback" -->
                        </div>
                        <!--
                        <div class="form-group">
                            <label for="mdp"> Mot de passe </label>
                            <input type="password" class="form-control col-7" id="mdp" placeholder="Mot de passe">
                        </div>
                        -->
                        <button type="submit" class="btn btn-primary"> Confirmer </button>
                    </form>
                </div>
            </div>
    </body>
</html>
