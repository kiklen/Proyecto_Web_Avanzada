<%-- 
    Document   : usuarios
    Created on : 12/05/2019, 11:35:32 AM
    Author     : MCSS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="usuarios" scope="session" class="basedatos.beans.UsuarioBean" />
        
        <table  WIDTH="100%" HEIGHT="100%">
            <tr>
                <td VALIGN="MIDDLE" ALIGN="CENTER">
                    <form name="forma" action="controlUsuarios.jsp" method="POST">
                        <table border="0" cellspacing="3" cellpadding="3">
                            <tr>
                                <%--!
                                    comprueba que el atributo mensaje si exista,
                                    para que no aparezca null asigna un espacio vacío
                                --%>
                                <td class="mensajes" colspan="2">
                                    <jsp:expression>
                                        request.getAttribute("mensaje") == null ? "" : request.getAttribute("mensaje")
                                    </jsp:expression>
                                </td>
                            </tr>

                            <tr>
                                <td class="tituloTabla" colspan="2">Control de Usuarios</td>
                            </tr>
                            <tr>
                                <td class="textoForma">Usuario</td>
                                <td >
                                    <input type="text" class="captura" name="usuario" value="<jsp:getProperty name="usuarios" property="usuario"/>" size="15" />
                                    <input type="submit" value="Buscar" name="accion" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">Password</td>
                                <td>
                                    <input type="text" class="captura"  name="password" value="<jsp:getProperty name="usuarios" property="password"/>" size="15" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">Nombre</td>
                                <td>
                                    <input type="text" class="captura" name="nombre" value="<jsp:getProperty name="usuarios" property="nombre"/>" size="45" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">Categoria</td>
                                <td>
                                    <input type="text" class="captura" name="categoria" value="<jsp:getProperty name="usuarios" property="categoria"/>" size="15" />
                                </td>
                            </tr>
                            
                            
                            <tr>
                                <td colspan="2" align="center">
                                    <input type="submit" value="Agregar" name="accion" /> 
                                    <input type="submit" value="Actualizar" name="accion" /> 
                                    <input type="submit" value="Otra busqueda" name="accion" />
                                </td>
                            </tr>
                            <tr>
                                <td class="tituloTabla" colspan="2"> &nbsp;</td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>