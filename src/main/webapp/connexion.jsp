<%-- 
    Document   : connexion
    Created on : Aug 6, 2020, 11:49:43 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
    <div class=" col-lg-10 offset-2">
        <form action="Login">
            <div class="form-group">
                <label for="login"> Nom d'utilisateur </label>
                <input type="text" class="form-control col-7" id="login" placeholder="entrer votre nom d'utilisateur">
                <!--  div class="valid-feedback" -->
            </div>
            <div class="form-group">
                <label for="mdp"> Mot de passe </label>
                <input type="password" class="form-control col-7" id="mdp" placeholder="Mot de passe">
            </div>
            <button type="submit" class="btn btn-primary"> Connexion </button>
        </form>
    </div>
</div>