<%-- 
    Document   : connexion
    Created on : Aug 6, 2020, 11:49:43 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
    <div class=" col-lg-10 offset-2">
        <form action="Login" method="post">
            <div class="form-group">
                <label for="utilisateur"> Nom d'utilisateur </label>
                <input type="text" class="form-control col-7" id="utilisateur" name="utilisateur" placeholder="entrer votre nom d'utilisateur">
                <!--  div class="valid-feedback" -->
            </div>
            <div class="form-group">
                <label for="mdp"> Mot de passe </label>
                <input type="password" class="form-control col-7" id="mdp" name="mdp" placeholder="Mot de passe">
            </div>
            <button type="submit" class="btn btn-primary"> Connexion </button>
        </form>
    </div>
</div>
<div class="row offset-2 pt-2">
    <br >
    <br >
    <br >
    <br >
    <a href="CreationUtilisateur.jsp"> Nouveau? Inscrivez-vous! </a>
</div>