<%-- 
    Document   : paramObj
    Created on : Mar 27, 2018, 10:29:22 PM
    Author     : Parth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Called page: </h2> 
        <b>Names:</b>
        <br>Name1: <%= request.getParameter("param1") %>
        <br>Name2: <%= request.getParameter("param2") %>
        <br> Name3: <%= request.getParameter("param3") %>
        <br>
    </body>
</html>
