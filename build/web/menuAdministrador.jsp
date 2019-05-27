<%-- 
    Document   : meuAdministrador
    Created on : 16/05/2019, 07:53:29 PM
    Author     : MCSS
--%>

<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
        <title>JSP Page Página Administrador</title>
    </head>
    <body class="body">
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
            out.print("Id de verif de sesión  " + estatus.getId());
            out.print("<br><br>");            
            out.print("Session obtenida " + estatus.getId());
            request.getAttribute("categoria");
            out.print(request.getAttribute("categoria"));            

        --%>
        <h1>Menu del administrador </h1>        
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
                <table border="0" width="100%" height="100%" align="center" >
                    <th class="menu"><a class="sinsubr" href=mostrarUsuarios.jsp>Usuarios</a></th>
                    <th class="menu"><a class="sinsubr" href="mostrarProductos.jsp">Productos</a></th>
                    <th class="menu"><a class="sinsubr" href="terminarSesion.jsp">Salir</a></th>

                </table>
            </h2>
            <h3>
                <table border="0" width="100%" height="100%" >                    
                    <tr height="80%">
                        <th wigth="100%">                                                
                            <jsp:include page='<%= request.getAttribute("contenido").toString()%>'/>
                        </th>
                    </tr>
                    <tr>
                        <th>
                        <jsp:expression>request.getAttribute("mensaje") == null ? "" : request.getAttribute("mensaje")</jsp:expression>
                    </th>
                </tr>
            </table>
        </h3>
    </body>
</html>
