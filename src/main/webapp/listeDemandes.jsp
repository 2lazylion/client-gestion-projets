<%-- 
    Document   : demandeRecu
    Created on : Aug 6, 2020, 9:04:49 PM
    Author     : Edward Cadet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" import="java.util.*,com.bdeb.gestion_projets.model.Demande,com.bdeb.gestion_projets.model.DemandePK" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
        <link rel="stylesheet" href="css/styles.css">
        <title> Liste des demandes </title>
    </head>
    <body class="bg-secondary">
        <!-- barre de navigation -->
        <jsp:include page="nav.jsp" />
        
        <!-- container principal -->
        <div class="container bg-light fill">
            <!-- titre -->
            <div class="row">
                <div class=" col-lg-10 offset-1">
                    <h1 class="display-4 mb-3"> Liste des demandes </h1>
                </div>
            </div>
            
            
            <!-- tableau des projets -->
            <% ArrayList<Demande> listeDemandes = (ArrayList<Demande>) request.getAttribute("mesDemandes"); %>
            <div>
                <table class="table">
                    <thead>
                        <tr>
                            <th> Id </th>
                            <th> Recu le: </th>
                            <th> Etat de la demande </th>
                            <th>  </th>
                            <th>  </th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for(int i = 0; i < listeDemandes.size(); i++) {
                            Demande demande = (Demande) listeDemandes.get(i);
                        %>
                        <!-- TODO: afficher seulement les demandes en cours -->
                        <c:if test="<%= demande.getEtatDemande().equals("EN_COURS") %>">
                        <tr>
                            <td>  </td>
                            <td> <%= demande.getDateDemande() %> </td>
                            <td> <%= demande.getEtatDemande() %> </td>
                            
                            <%  String idUtilisateur = String.valueOf(demande.getDemandePK().getIdUtilisateur());
                                String idProjet = String.valueOf(demande.getDemandePK().getIdUtilisateur()); 
                                String destinataire = demande.getDemandePK().getDestinataire();
                                String queryParam ="&idUtilisateur=" + idUtilisateur + "&idProjet=" + idProjet + "&destinataire=" + destinataire; %>
                                <td> <a href="EnvoyerReponseDemande?reponseDemande=accepter<%= queryParam %>"> Accepter </a> </td>
                            <td> <a href="EnvoyerReponseDemande?reponseDemande=refuser<%= queryParam %>"> Refuser </a> </td>
                        </tr>
                        </c:if>
                    </tbody>
                    <%
                        }
                        session.invalidate ();
                    %>
                </table>
            </div>
                              
        </div>
    </body>
</html>
