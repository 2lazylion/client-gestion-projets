<%-- 
    Document   : CreationUtilisateur
    Created on : Aug 8, 2020, 10:03:10 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
        <title> Creation d'un nouveau compte </title>
    </head>
    <body class="bg-secondary">
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
        
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> Creation d'un nouveau compte </h1>
                </div>
            </div>
            
            <!-- formulaire de creation d'un nouveau compte -->
            <div class="row">
                <div class=" col-lg-10 offset-2">
                    <form action="CreationUtilisateur" method="post">
                        <div class="form-group">
                            <label for="nomProjet"> Nom d'utilisateur </label>
                            <input type="text" class="form-control col-7" id="nomProjet" name="nomUtilisateur" placeholder="nom d'utilsateur">
                            <!--  div class="valid-feedback" -->
                        </div>
                        
                        <div class="form-group">
                            <label for="email"> email </label>
                            <input type="email" class="form-control col-7" id="nomProjet" name="email" placeholder="email">
                            <!--  div class="valid-feedback" -->
                        </div>
                        
                        <div class="form-group">
                            <label for="mdp"> Mot de passe </label>
                            <input type="password" class="form-control col-7" id="mdp" name="mdp" placeholder="Mot de passe">
                        </div>
                        
                        <div class="form-group">
                            <label for="mdpConfirme"> Confirmer votre mot de passe </label>
                            <input type="password" class="form-control col-7" id="mdpConfirme" name="mdpConfirme" placeholder="Confirmer Mot de passe">
                        </div>
                        
                        <button type="submit" class="btn btn-primary"> Confirmer </button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>