<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><c:out value="From display.jsp"/></h1>
        
        <h4><c:out value="${student.eNo}"/></h4>
        <h4><c:out value="${student.name}"/></h4>
        
        <c:forEach items="${students}" begin="0"  var="s">
            <h5>${s.name}, ${s.eNo}</h5>
        </c:forEach>
    </body>
</html>
