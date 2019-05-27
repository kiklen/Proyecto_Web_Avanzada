<%-- 
    Document   : crearProducto
    Created on : 27/05/2019, 01:40:56 AM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="basedatos.beans.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Categorias</title>
        <link href="https://fonts.googleapis.com/css?family=Gloria+Hallelujah|Lobster&display=swap" rel="stylesheet"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <script>
            function cambiar(){
                var pdrs = document.getElementById('file-upload').files[0].name;
                document.getElementById('info').innerHTML = pdrs;
            }
        </script>
        <link rel="stylesheet" type="text/css" href="../css/base.css"> 
        <style type="text/css"> </style>
    </head>
    <body>
        <div class="banner">
            <h1 class="title">Categoria</h1>
        </div>
        
        <div class="head">
            <div class="row">
                <span class="col text">Nombre</span>
                <span class="col "> 
                    <button class="add">
                        Agregar
                    </button>
                </span>
            </div>
        </div>
        <div class="container " style="color:white">
            
            
            <%
                                
                List <Producto> productos = new ArrayList();
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
               // productos.get(0).getNombre();
                for (int idx = 0; idx < productos.size(); idx++) {
                  
            %>
            <div class="row">
                <span class="col text"><%= productos.get(idx).getNombre()%></span>
                <span class="col">
                    <button class="agregar"><img src="editar.png" alt="" style="border-radius: 30px; width: 3vh;height: 3vh; "></button>
                    <button class="agregar"><img src="eliminar.png" alt="" style="border-radius: 30px; width: 3vh;height: 3vh; "></button>
                </span>
            </div>
            <%
                    
                }
            %>
            
        </div>
    </body>
</html>

