<%-- 
    Document   : control
    Created on : 4/05/2019, 06:27:39 PM
    Author     : MCSS
--%>

<%@page session="true" %>
<%@page import="basedatos.AccesoBD"%>
<%@page import="basedatos.beans.UsuarioBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
        <title>Control</title>
    </head>
    <body class="bodyCentrado">        
        <jsp:scriptlet>
            String vista = "";
            String cate = "";
            String contenido="menuAdministrador.jsp";
           
            if (request.getParameter("enviar").equals("Enviar")) {                                                                  
            
                UsuarioBean usuario = new UsuarioBean();
                usuario.setUsuario(request.getParameter("usuario"));
                usuario.setPassword(request.getParameter("password"));
                
                if (AccesoBD.conectarBD()) {
                    if (usuario.buscarUsuario()) {
                        request.setAttribute("nombre", usuario.getNombre());
                        request.setAttribute("categoria", usuario.getCategoria());
                        request.setAttribute("usuario", usuario.getUsuario());                        
                        request.setAttribute("password", usuario.getPassword());
                        cate=usuario.getCategoria();                                                
                        
                        HttpSession estado = request.getSession();
                        estado.setAttribute("nombre", usuario.getNombre());                        
                        estado.setAttribute("categoria",usuario.getCategoria());
                        estado.setAttribute("usuario",usuario.getUsuario());                        
                        estado.setAttribute("password",usuario.getCategoria());
                        
                        
                        request.setAttribute("cate",cate);                        
                        request.getParameter(cate);
                        
                        //response.senRedirect("menuAdministrador.jsp");
                                                                                       
                if (cate.contains("Administrador")) {
                    request.setAttribute("vista","menuAdministrador.jsp");
                    request.setAttribute("contenido","usuarios.jsp");
                    request.setAttribute("categ","administrador"); 
                    contenido="usuarios.jsp";                    
                    vista="menuAdministrador.jsp";
                    //response.sendRedirect("menuAdministrador.jsp");                    
            } 
            else {
                if(cate.contains("Usuario")) { 
                    request.setAttribute("vista","menuUsuarios.jsp");
                    request.setAttribute("contenido","productos.jsp");
                    request.setAttribute("categ","usuario");
                    contenido="productos.jsp";
                    vista="menuUsuarios.jsp";
                    //response.sendRedirect("menuUsuarios.jsp");                    
                }
                else{
                    request.setAttribute("mensaje", "Consulta al administrador,"
                            + " porque no tienes asignada una categoria");
                    vista = "error.jsp";
                    request.setAttribute("vista",vista);                    
                    request.setAttribute("contenido",contenido);
                    </jsp:scriptlet>                    
                    <jsp:forward page="<%= vista %>" /> 
                    <jsp:scriptlet>
                    }
            }                                     
                        
                    } else {
                        request.setAttribute("mensaje",
                                "Usuario/Contrase&ntilde;a incorrectos");
                       vista = "error.jsp";
                       request.setAttribute("vista",vista);                       
                       request.setAttribute("contenido",contenido);
</jsp:scriptlet>
                       <jsp:forward page="<%= vista %>" />
                       <jsp:scriptlet>                           
                    }
                } else {
                    request.setAttribute("mensaje",
                            "Error en Conexi&oacute;n");
                    vista = "error.jsp";
                    request.setAttribute("vista",vista);
                    request.setAttribute("contenido",contenido);
</jsp:scriptlet>
                    <jsp:forward page="<%= vista %>" />                    
<jsp:scriptlet>                        
                }
            }
                    
        </jsp:scriptlet>                
  <jsp:forward page="<%= vista %>" />
        </body>
</html>