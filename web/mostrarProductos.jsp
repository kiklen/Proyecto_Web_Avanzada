<%-- 
    Document   : mostrarProductos
    Created on : 25/05/2019, 06:01:44 PM
    Author     : MCSS
--%>
<%@page session="true" %>
<jsp:useBean id="usuarios" scope="session" class="basedatos.beans.UsuarioBean" />

<%
    String ir="";
    
    HttpSession estatus = request.getSession();
    
    String categoria = estatus.getAttribute("categoria").toString();    
    out.println("\n"+categoria);                 
    
    request.setAttribute("contenido","productos.jsp");      
    
    if (categoria.contains("Administrador")) {   
        ir="menuAdministrador.jsp";
    }
    else{
        ir="menuUsuarios.jsp";
        System.out.println("CatEGORIA  "+usuarios.getCategoria().toString());
        System.out.println("VOY A MENUUSUARIOS.JSP  ");
    }
%>

<jsp:forward page="<%= ir %>"/>
