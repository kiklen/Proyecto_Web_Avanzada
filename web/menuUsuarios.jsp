<%-- 
    Document   : menuUsuarios
    Created on : 18/05/2019, 01:21:59 PM
    Author     : MCSS
--%>

<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:useBean id="usuarios" scope="session" class="basedatos.beans.UsuarioBean" />
        <%
            HttpSession estatus = request.getSession();
            String nombre =    estatus.getAttribute("nombre").toString();
            String categoria = estatus.getAttribute("categoria").toString();
            String usuario =    estatus.getAttribute("usuario").toString();
            String password = estatus.getAttribute("password").toString();
                        
            out.println("\nId de verif de sesion  " + estatus.getId());
            
            out.println("\n"+nombre);             
            out.println("\n"+categoria);             
            out.println("\n"+usuario);            
            out.println("\n"+password);
        %>
        <%--           
           out.print("Id de verif de sesión " + estatus.getId());
           out.print("<br><br>");
           request.getAttribute("categoria");           
           out.print("Session obtenida "+ estatus.getId());
           out.println(request.getAttribute("categoria"));           
        --%>
        <h1>Menu del usuario </h1>
        <table border="0" align="right" >
            <tbody>
                <tr>
                    <td>
                        Bienvenida
                        <jsp:expression>nombre</jsp:expression>                        
                    </td>
                </tr>
            </tbody>
        </table>        
        <h2>
            <table border=0 width="100%" height="100%" align="center" >
                <tr class="menu">                                            
                    <th><a href="mostrarProductos.jsp">Productos</a></th>
                    <th><a href="terminarSesion.jsp">Salir</a></th>                                           
                </tr>                
            </table>
        </h2>
        <h3>
            <table border="0" width="100%" height="100%" >
                <tbody>                     
                    <tr height="80%">
                        <th weigth="100%">
                            <jsp:include page='<%= request.getAttribute("contenido").toString()%>'/>
                        </th>
                    </tr>
                    <tr height="5%" colspan="2"> 
                        <th>
                            <jsp:expression>request.getAttribute("mensaje") == null ? "" : request.getAttribute("mensaje")</jsp:expression>
                            </th>
                        </tr>
                    </tbody>
                </table>
                <br>
            </h3>
        </body>
    </html>
