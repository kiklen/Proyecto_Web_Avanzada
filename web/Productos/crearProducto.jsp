<%-- 
    Document   : crearProducto
    Created on : 27/05/2019, 01:40:56 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Producto</title>
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
            <h1 class="title">Producto</h1>
        </div>
        
        <div class="container">
            <div class="row" >
                <div class="col-3">
                    <% 
                        String imagen = "../img/prueba.png";
                    %>           
                    <img alt="" src="../img/prueba.png">
                    <label for="file-upload" class="subir">
                        <i class="fas fa-cloud-upload-alt"></i> Archivo
                    </label>
                    <div id="info" style="color: white"></div>
                    <input id="file-upload" onchange='cambiar()' type="file" style='display: none;'/>
                </div> 
                <div class="col-3">
                    <span class="text">Proveedor</span>
                    <select name="proveedor" class="elemento">
                        
                    </select>
                </div> 
                 <div class="col-3">
                    <span class="text">Cantidad</span>
                    <input name="cantidad" class="elemento" type="number" placeholder="">
                </div>
                <div class="col-3">
                    <span class="text">Garantia</span>
                    <input name="garantia" class="elemento" type="number" placeholder="">
                </div>                    
            </div>
                    
            <div class="row" style="margin-top: 2vh">
                <div class="col-3">
                    <span class="text">Nombre &nbsp&nbsp&nbsp</span>
                    <input name="cantidad" class="elemento" type="text" placeholder="">
                </div> 
                <div class="col-3">
                    <span class="text">Precio Compra</span>
                    <input name="cantidad" class="elemento" type="number" placeholder="">
                </div> 
                 <div class="col-3">
                    <span class="text">Precio Venta</span>
                    <input name="cantidad" class="elemento" type="number" placeholder="">
                </div>
                <div class="col-3">
                    <span class="text">Categoria</span>
                    <select name="proveedor" class="elemento">
                        
                    </select>
                </div>                     
            </div>
                    
            <div class="row" style="margin-top: 2vh;">
                <span class="text col-3">Descripcion</span>
                <textarea class="area col-5"></textarea>
            </div>
            
        </div>
    </body>
</html>
