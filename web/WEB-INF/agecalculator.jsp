<%-- 
    Document   : agecalculator.jsp
    Created on : Sep 13, 2019, 3:49:03 PM
    Author     : 797462
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Form</title>
    </head>
    
    <body>
       
        <h1>Age Calculator</h1>
        
        <div>
            
            <form action="age" method="post">
                Enter your age: <input type="number" name="inputAge"><br>
                                <input type="submit" value="Age next birthday">
            </form>
            ${whatever}
        </div>
        
    </body>
</html>
