

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach items="${people}" var="p"> 
            <c:out value="${p.firstName} "/>
            <c:out value="${p.lastName}"/>
            <br/>
        </c:forEach>
            
               
    </body>
</html>
