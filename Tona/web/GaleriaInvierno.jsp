<%-- 
    Document   : GaleriaInvierno
    Created on : 17/08/2017, 19:31:06
    Author     : gusti
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/stylegalerias.css">
        <!--<link rel="stylesheet" href="Content/testCSS.css" type="text/css">-->
        <!--        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <link rel="stylesheet" href="https://material-components.github.io/material-components-web-catalog/static/css/styles/App.scss">
        <link rel="stylesheet" href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css">
        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>

        <title>Galer�a</title>
    </head>
    <body>
        <nav id='nav' class="navbar navbar-dark fixed-top">
            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="Image/maniqui.png"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <div class=" navbar justify-content-end">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="aTxtColor" href="Galeria.jsp">Galeria</a>
                        </li>
                        <li class="nav-item">
                            <a class="aTxtColor" href="Contactos.jsp">Contacto</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div>
            <h1 id="encabezado" class="container-fluid">TEMPORADA OTO�O-INVIERNO</h1>
        </div>
        <div class="masonry-container-image">

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
            <!--            <div class="grid-container">
            <c:forEach items="${producto}" var="p">
                <div class="polaroid2">
                    <img style="width:25%; height: 500px" src="ObtenerImagenGaleriaInvierno?cod=${p.idproducto}" alt="Imagen Producto">
                    <div class="container2">
                        <p><c:out value="${p.descripcion}"/></p>                                   
                    </div>    
                </div>
            </c:forEach>
        </div>-->
        </div>
        <nav id="nav" class=" navbar-inverse fixed-bottom">
            <div id="txtfooter">
                <p class="text-center credit txtbtn">- TONA - Santa Eufemia, Cordoba, Argentina</p>
                <div class="text-center img">
                    <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                    <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>
                </div>
            </div>
        </nav>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
        <script>
            lightbox.option({
                'resizeDuration': 200,
                'wrapAround': true,
                'alwaysShowNavOnTouchDevices': true,
                'albumLabel': "",
                'positionFromTop': 50
            })
        </script>
    </body>
</html>