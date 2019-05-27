<%-- 
    Document   : error
    Created on : 5/05/2019, 10:31:45 AM
    Author     : MCSS
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Refresh" content="2;URL=index.jsp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="misestilos/estilos2.css" />
        <title>JSP Error</title>
    </head>
    <body  class="error">
        
        <h2 class="bodyCentrado"> 
            <jsp:expression>request.getAttribute("mensaje")</jsp:expression>
        </h2>        
    </body>
</html>
