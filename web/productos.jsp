<%-- 
    Document   : producto
    Author     : MCSS
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="producto" scope="session" class="basedatos.beans.ProductoBean" />        
       
        <table border="0"  WIDTH="100%" HEIGHT="100%">
            <tr>
                <td VALIGN="MIDDLE" ALIGN="CENTER">
                    <form name="forma" action="controlProductos.jsp" method="POST">
                        <table border="0" cellspacing="3" cellpadding="3">
                            
                            <tr>
                                <td class="tituloTabla" colspan="2">Control de Productos</td>
                            </tr>
                            <tr>
                                <td class="textoForma">Clave</td>
                                <td >
                                    <input type="text" class="captura" name="clave" value="<jsp:getProperty name="producto" property="clave"/>" size="10" />
                                    <input type="submit" value="Buscar" name="accion" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">Descripci&oacute;n</td>
                                <td>
                                    <input type="text" class="captura"  name="descripcion" value="<jsp:getProperty name="producto" property="descripcion"/>" size="45" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">L&iacute;nea</td>
                                <td>
                                    <input type="text" class="captura" name="linea" value="<jsp:getProperty name="producto" property="linea"/>" size="45" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">Precio</td>
                                <td>
                                    <input type="text" class="captura" name="precio" value="<jsp:getProperty name="producto" property="precio"/>" size="15" />
                                </td>
                            </tr>
                            <tr>
                                <td class="textoForma">Existencia</td>
                                <td>
                                    <input type="text" class="captura" name="existencia" value="<jsp:getProperty name="producto" property="existencia"/>" size="15" />
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
                            <%--
                            <tr>                                
                                <td class="mensajes" colspan="2" align="center">
                                    <br><br>                                    
                                    <jsp:expression>request.getAttribute("mensaje") == null ? "" : request.getAttribute("mensaje")</jsp:expression>
                                    <br><br>
                                </td>
                            </tr>
                            --%>
                        </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>