<%-- 
    Document   : countToN
    Created on : Apr 9, 2018, 10:21:04 AM
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
        <%
            for(int i=1;i<=10;i++){
                out.println(i);
            }
        %>
    </body>
</html>
