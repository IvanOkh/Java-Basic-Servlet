<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 16, 2019, 9:52:46 AM
    Author     : 797462
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <div>
            
            <form action="arithmetic" method="post">
                First: <input type="text" name="inputOne" value="${one}"><br>
                Second: <input type="text" name="inputTwo" value="${two}"><br>
                                <input type="submit" name="actionButton" value="+">
                                <input type="submit" name="actionButton" value="-">
                                <input type="submit" name="actionButton" value="*">
                                <input type="submit" name="actionButton" value="%">
            </form>
            <br>
            ${whatever2}
        </div>
    </body>
</html>
