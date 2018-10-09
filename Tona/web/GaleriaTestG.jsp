<%-- 
    Document   : GaleriaTestG
    Created on : 19/09/2018, 15:37:01
    Author     : gusti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link
            <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css">
        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
        <link rel="stylesheet" href="Content/testCSS.css" type="text/css">
        <link rel="stylesheet" href="https://material-components.github.io/material-components-web-catalog/static/css/styles/App.scss">
        <title>JSP Page</title>
    </head>
    <body>
        <button class="mdc-button mdc-button--outlined mdc-button--unelevated">TEST</button>
        <button class="mdc-fab ">TEST</button>

        <ul class="mdc-image-list mdc-image-list--masonry my-masonry-image-list">
            <c:forEach items="${producto}" var="p">
                <li class="mdc-image-list__item">
                    <div class="mdc-card">
                        <img class="mdc-image-list__image img-rounded" src="ObtenerImagenGaleriaInvierno?cod=${p.idproducto}">
                        <div class="mdc-image-list__supporting">
                            <span class="mdc-image-list__label"><label class="text-card"><c:out value="${p.descripcion}"/></label>  </span>
                        </div>

                    </div>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
