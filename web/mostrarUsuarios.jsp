%-- 
    Document   : mostrarUsuarios
    Created on : 25/05/2019, 05:56:35 PM
    Author     : MCSS
--%>

<%@page session="true" %>
<jsp:useBean id="usuarios" scope="session" class="basedatos.beans.UsuarioBean" />
<%
    request.setAttribute("contenido","usuarios.jsp");
    String ir="menuAdministrador.jsp";
    
%>

<jsp:forward page="<%= ir %>" />

