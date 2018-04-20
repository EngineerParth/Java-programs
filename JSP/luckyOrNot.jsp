<%-- 
    Document   : luckeyOrNot
    Created on : Mar 23, 2018, 10:48:07 PM
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
            double num = Math.random();
            if(num > 0.5){
                out.println("Congratulations, you'll have a lucky day! " + num);
            }
            else{
                out.println("OOPS!, may be next day... " + num);
            }
            %>
    </body>
</html>
