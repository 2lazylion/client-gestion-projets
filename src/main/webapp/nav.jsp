<%-- 
    Document   : nav
    Created on : Aug 6, 2020, 7:41:29 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- barre de navigation -->
<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Gestion de projets</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="Login"> Connexion <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="listeProjets"> Liste des projets </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="GestionProjets"> Gestions de mes projets </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="CreationProjet.jsp"> Creer un nouveau projet </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Demandes"> Demandes de participation </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dropdown
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="listeProjets"> Liste des projets </a>
                        <a class="dropdown-item" href="GestionsProjets"> Gestions de mes projets </a>
                        <a class="dropdown-item" href="CreationProjet.jsp"> Creer un nouveau projet </a>
                        <a class="dropdown-item" href="Demandes"> Demandes de participation </a>
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
