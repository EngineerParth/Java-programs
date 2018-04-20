<%-- 
    Document   : paramID
    Created on : Mar 27, 2018, 10:28:47 PM
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
        <jsp:include page='/paramObj.jsp'>
            <jsp:param name="param1" value="val1"></jsp:param>
            <jsp:param name="param2" value="val2"></jsp:param>
            <jsp:param name="param3" value="val3"></jsp:param>
        </jsp:include>
        <br><h1>calling page:</h1>
        <br>Name 1 : <%=request.getParameter("param1")%>
        <br>Name 2 : <%=request.getParameter("param2")%>
        <br>Name 3 : <%=request.getParameter("param3")%>
    </body>
</html>
