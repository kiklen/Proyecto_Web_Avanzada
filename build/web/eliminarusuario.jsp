<%-- 
    Document   : eliminarusuario
    Created on : 13/05/2019, 12:12:29 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
        <style>
            .aceptar{
                background-color: transparent; border: solid; border-color: cornflowerblue; height: 4vh;  border-radius: 3px; 
            }
            .aceptar:hover{
                background-color: cornflowerblue; border: transparent; border-color: white; height: 4vh;  border-radius: 3px; color: white; cursor: pointer
            }
            .cancelar{
                background-color: transparent; border: solid; border-color: #ff6666; height: 4vh; border-radius: 3px; margin-left: 2vh
            }
            .cancelar:hover{
                background-color: #ff6666; border: transparent; border-color: white; height: 4vh; border-radius: 3px; color: white; cursor: pointer
            }
            .regresar{
                background-color: transparent; border: solid; border-color: #00cc99; height: 4vh;  border-radius: 3px; margin-left: 2vh
            }
            .regresar:hover{
                background-color: #00cc99; border: transparent; border-color: white; height: 4vh;  border-radius: 3px; color: white; cursor: pointer
            }
        </style>
    </head>
    <body>
        <div style="width: 100%; height: 15%; background-color: coral">
            <center>
                <h1 style="color: white; text-shadow: 2px 2px 2px #000;">Eliminar Usuario</h1>
            </center>            
        </div>
        
        <div style="position: absolute; top: 15%;left: 35%;">
            <img src="usuario.jpg" alt="" style="margin-left: 7vw">
        </div>
        
        <div style="position: absolute; top: 45%;left: 35%; box-shadow: 0px 0px 4px 2px #A1A1A1; height: 20%; width: 25%; padding: 3vh; border-radius: 5px">
            <form action="" method="post">
                Usuario: <input type="text" name="usuario" style="margin-bottom: 1vh;border-radius: 5px; margin-left: 1.3vh"> <br>
                <div>
                    <input type="submit" value="Aceptar" class="aceptar">
                    <button class="cancelar">
                        Cancelar
                    </button>
                    <button class="regresar">
                        Regresar
                    </button>
                </div>
            </form>
        </div>
        
        
    </body>
</html>
