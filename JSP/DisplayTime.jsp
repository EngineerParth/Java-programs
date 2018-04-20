<%-- 
    Document   : DisplayTime
    Created on : Mar 27, 2018, 10:39:35 PM
    Author     : Parth
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%response.setHeader("refresh","3");%>
        Current Date : <%= new Date()%>
    </body>
</html>
