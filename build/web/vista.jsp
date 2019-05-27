<%-- 
    Document   : vista
    Created on : 4/05/2019, 04:10:19 PM
    Author     : MCSS
--%>
<%@page session="true" %>
<%@page import="basedatos.beans.UsuarioBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">                                   
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
        <title>JSP Vista</title>
    </head>
    <body class="bodyCentrado">            
            <jsp:expression>
                request.getAttribute("nombre") == null ? "" : ("Bienvenida&nbsp;"+request.getAttribute("nombre"))               
            </jsp:expression>
    </body>
</html>
