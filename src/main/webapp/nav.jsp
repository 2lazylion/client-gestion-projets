<%-- 
    Document   : nav
    Created on : Aug 6, 2020, 7:41:29 PM
    Author     : Edward Cadet
--%>
<!-- affiche ce nav pour ceux qui sont logger -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- barre de navigation -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-primary">
        <a class="navbar-brand text-light" href="#">Gestion de projets</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <!--
                <li class="nav-item active">
                    <a class="nav-link text-light" href="Login"> connexion <span class="sr-only">(current)</span></a>
                </li>
                -->
                <li class="nav-item">
                    <a class="nav-link text-light" href="listeProjets"> Liste des projets </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-light" href="GestionProjets"> Gestions de mes projets </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-light" href="CreationProjet.jsp"> Creer un nouveau projet </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-light" href="ListeDemandes"> Demandes de participation </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-light" href="ListeDemandes"> Déconnexion </a>
                </li>
                <li class="nav-item dropdown">
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="listeProjets"> Liste des projets </a>
                        <a class="dropdown-item" href="GestionsProjets"> Gestions de mes projets </a>
                        <a class="dropdown-item" href="CreationProjet.jsp"> Creer un nouveau projet </a>
                        <a class="dropdown-item" href="ListeDemandes"> Demandes de participation </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
                <!-- TODO: Invisible lorqu'on n'est pas connecté, apparait lorsqu'on est connecté 
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Logout</a>
                </li>
                -->
            </ul>
            <!--
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
            -->
        </div>
    </nav>
</div>
