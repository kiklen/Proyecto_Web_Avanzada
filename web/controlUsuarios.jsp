<%-- 
    Document   : controlUsuarios
    Created on : 12/05/2019, 09:48:42 AM
    Author     : MCSS
--%>

<%@page session="true" %>
<%@page import="basedatos.AccesoBD"%>
<%@page import="basedatos.beans.UsuarioBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
<!DOCTYPE html>

<jsp:useBean id="usuarios" scope="session" class="basedatos.beans.UsuarioBean" />
<jsp:scriptlet>
    
UsuarioBean usuario = new UsuarioBean();
String vista="";
    
try {
        usuario.setUsuario(request.getParameter("usuario"));
        usuario.setPassword(request.getParameter("password"));
        usuario.setNombre(request.getParameter("nombre"));
        usuario.setCategoria(request.getParameter("categoria"));        
    } catch (Exception e) {
    }

    if (AccesoBD.conectarBD()) {
        
        if (request.getParameter("accion").equals("Agregar")) {            
            if (usuario.insertarUsuario()) {
                request.setAttribute("mensaje","Usuario registrado");
            } else {
                request.setAttribute("mensaje", "Error en operaci&oacute;n");
            }
        }
        
        if (request.getParameter("accion").equals("Actualizar")) {                                   
            if (usuario.actualizarUsuario()) {
                request.setAttribute("mensaje", "Usuario actualizado");
            } else {
                request.setAttribute("mensaje", "Error en operaci&oacute;n");
            }
        }

        if (request.getParameter("accion").equals("Buscar")) {            
            if (usuario.buscaUsuario()) {        
                request.setAttribute("mensaje", "Usuario encontrado");
                request.setAttribute("usuarios", usuario); 
            } else {
                request.setAttribute("mensaje", "Usuario no encontrado");
            }
        }
        
        if (request.getParameter("accion").equals("Otra busqueda")) {
            usuarios.setCategoria("");
            usuarios.setNombre(""); 
        }
        
    } else {
        request.setAttribute("mensaje", "Error en conexi&oacute;n");
    }
            
    vista="menuAdministrador.jsp";        
    request.setAttribute("contenido", "usuarios.jsp");    
    
    AccesoBD.cerrarConexion();
    
</jsp:scriptlet>
<jsp:forward page="<%= vista %>"/>

