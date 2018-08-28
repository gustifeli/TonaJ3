<%-- 
    Document   : EditProducto
    Created on : 07/05/2018, 18:52:39
    Author     : GustiFeli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>

        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <!--<link rel="stylesheet" href="Content/bootstrap.min.css">-->
        <!--<link rel="stylesheet" type="text/css" href="Content/bootstrap.css" >-->
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>+ - Producto</title>
    </head>
    <body background="Image/prueba.jpg">
        <nav id='nav' class="navbar navbar-dark">
            
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
        <div class="row">
            <div class="col-xs-0 col-md-3"></div>
            <div id="cont" class="col-xs-12 col-md-6">
                <c:forEach var="p" items="${producto}">
                    <form method="post" action="ActualizarProducto">
                        <div class="form-group">
                            <label for="titulo" style="font-size: 2em;"><strong>Producto:</strong></label>
                        </div>
                        <div class="form-group">
                            <input name="idproducto" type="text" value="${p.idproducto}">
                            <label for="titulo">Descripcion</label>
                            <textarea class="form-control" name="descripcion" rows="3" placeholder="Descripción">${p.descripcion}</textarea>
                        </div>
                        <div class="form-group">
                            <div>
                                <table class="table">
                                    <tr>
                                        <th style="text-align: left; vertical-align: middle; width: 20%;">
                                            <!--<input type="file" name="logo" accept="image/*" src="ObtenerImagen?cod=${p.idproducto}">-->
                                            <!--<img style="width: 75px" src="ObtenerImagen?cod=${p.idproducto}" alt="Imagen Produto">-->
                                            <select name="idCampana" placeholder="Seleccione la campaña" class="form-control" required>
                                                <c:forEach var="c" items="${campana}">
                                                    <option value="${c.idCampana}" <c:if test="${c.idCampana == p.idCampana}">selected</c:if>/>
                                                    <c:out value="${c.campana}"/>
                                                    </option>
                                                </c:forEach>
                                            </select>
                                        </th>
                                    </tr>
                                </table>
                                <center><div>
                                        <p><img id="imgMin" src="ObtenerImagen?cod=${p.idproducto}" class="img-rounded"></p>
                                    </div></center>
                            </div>
                        </div>
                        <div class="form-group">
                            <div>
                                <table class="table">
                                    <tr>
                                        <th style="text-align: center; vertical-align: middle; width: 50%;">
                                            <p><button type="submit" class="btn btn-ttc">Actualizar Producto</button></p>
                                        </th>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </form>
                </c:forEach>
            </div>
        </div>
        <div>
            <footer class="footer">
                <div>
                    <nav id="nav" class=" navbar-inverse fixed-bottom">
                        <div id="txtfooter">
                            <p class="text-center credit txtbtn"> - TONA - Santa Eufemia, Cordoba, Argentina</p>
                            <div class="text-center img">
                            </div>
                        </div>
                    </nav>
                </div>
            </footer>
        </div>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="Scripts/bootstrap.min.js"></script>           
    </body>
</html>
