<%-- 
    Document   : inicio
    Created on : 20-oct-2015, 21:28:06
    Author     : gusti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>            

<!DOCTYPE html>

<jsp:useBean id="mensaje" scope="request" class="java.lang.String" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">
        <link type="text/css" href="Content/error.css" rel="stylesheet">
        <link type="text/css" href="Content/bootstrap.min.css" rel="stylesheet">
        <title>Error</title>
    </head>
    <body background="Image/prueba.jpg">
        <div class="text-center">
            <div id="">
                <div>
                    <div class="col-xs-4 col-md-6 col-lg-8 text-center" id="divcenter">
                        <div><label class="control-label"><img src="Image/Error.png"></label></div>
                        <div><label> <c:out value="${mensaje}"/> </label></div>

                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
