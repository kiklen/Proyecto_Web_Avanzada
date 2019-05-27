<%-- 
    Document   : terminarSesion
    Created on : 19/05/2019, 11:57:25 PM
    Author     : MCSS
--%>

<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            HttpSession terminar = request.getSession();
            terminar.invalidate();
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
