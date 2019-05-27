<%-- 
    Document   : controlProductos
    Author     : MCSS
--%>
<%@page session="true" %>
<%@page import="basedatos.AccesoBD"%>
<%@page import="basedatos.beans.ProductoBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
<!DOCTYPE html>
<jsp:useBean id="usuarios" scope="session" class="basedatos.beans.UsuarioBean" />
<jsp:scriptlet>

String vista="";
ProductoBean producto = new ProductoBean();
    
try {  
        producto.setClave(request.getParameter("clave")); 
        producto.setDescripcion(request.getParameter("descripcion"));        
        producto.setLinea(request.getParameter("linea"));
        producto.setPrecio(Double.parseDouble(request.getParameter("precio"))); 
        producto.setExistencia(Integer.parseInt(request.getParameter("existencia")));
    } catch (Exception e) {
    }
    

    if (AccesoBD.conectarBD()) {
        if (request.getParameter("accion").equals("Agregar")) {                                    
            if (producto.insertarProducto()) {
                request.setAttribute("mensaje","Producto registrado"); 
            } else {                                
                request.setAttribute("mensaje", "Error en operaci&oacute;n");
                //vista="error.jsp";
            }
        }
                
        if (request.getParameter("accion").equals("Actualizar")) {                                    
            if (producto.actualizarProducto()) {
                request.setAttribute("mensaje", "Producto actualizado"); 
            } else {                                
                request.setAttribute("mensaje", "Error en operaci&oacute;n");
                //vista="error.jsp";
            }
        }

        
        if (request.getParameter("accion").equals("Buscar")) {            
            if (producto.buscarProducto()) {                
                request.setAttribute("mensaje", "Producto encontrado"); 
                request.setAttribute("producto", producto); 
            } else {                                 
                request.setAttribute("mensaje", "Producto no encontrado");
                //vista="error.jsp";
            }
        }
        
        if (request.getParameter("accion").equals("Otra busqueda")) {            
            producto.setClave("");
            producto.setDescripcion("");            
        }                
    } else {
        request.setAttribute("mensaje", "Error en conexi&oacute;n");
        //vista="error.jsp";
    } 
    
    HttpSession estatus = request.getSession();         
    String categoria = estatus.getAttribute("categoria").toString();
    
    if (categoria.contains("Administrador")) {
        vista="menuAdministrador.jsp";
    }
    else {
        vista="menuUsuarios.jsp";
    }
        
    request.setAttribute("vista", vista);
    request.setAttribute("contenido","productos.jsp");
    
    AccesoBD.cerrarConexion();
    
</jsp:scriptlet>
<jsp:forward page="<%= vista %>"/>