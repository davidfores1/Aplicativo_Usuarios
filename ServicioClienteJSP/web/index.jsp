<%-- 
    Document   : index
    Created on : 19/02/2021, 07:43:00 AM
    Author     : david
--%>


<%@page import="modelo.UsuariosService"%>
<%@page import="java.util.List"%>
<%@page import="webservice.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>APELLIDOS</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                UsuariosService user = new UsuariosService();
                                List<Usuario> datos = user.listar();
                                for (Usuario u : datos) {

                            %>
                            <tr>
                                <td><%= u.getId()%></td>
                                <td><%= u.getNombre()%></td>
                                <td><%= u.getApellido()%></td>
                                <td><a href ="" class="btn btn-warning">Editar</a> 
                                    <a href = "" class="btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                            <% }%>
                        </tbody>
                    </table>
                </div>
            </div>

        </div> 
    </body>
</html>
