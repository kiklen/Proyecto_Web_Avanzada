<%-- 
    Document   : index
    Created on : 5/05/2019, 12:00:30 AM
    Author     : MCSS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no,
              initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Index</title>
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
    </head>
    <body> 
        <form name="formulario_Post" action="control.jsp" method="POST" class="login" >
            <fieldset>
                <legend>
                    <img src="misestilos/imagenes/usuario.jpg" width="40%" height="40%"  />
                </legend>
                <br><br>
                Usuario: <input type="text" name="usuario" value="" size="25" />
                <br><br>
                Contrase&ntilde;a: <input type="password" name="password" value="" size="15" />
                <br><br><br>
                <input type="submit" value="Enviar" name="enviar" />
                <br><br>
            </fieldset>
        </form>    
    </body>        
</html>
