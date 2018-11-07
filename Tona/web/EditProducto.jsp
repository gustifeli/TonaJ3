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
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>+ - Producto</title>
    </head>
    <body background="Image/prueba.jpg">
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

        <div class="modals">
            <div class="container-fluid">
                <div class="modal-content">
                    <div class="modal-header">
                        <hi id="encabezado" class="modal-title">Modificar Producto</hi>
                    </div>
                    <div class="modal-body">

                        <c:forEach var="p" items="${producto}">
                            <form method="post" action="ActualizarProducto">

                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-lg-9">
                                            <div class="input-group input-id">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text">ID</span>
                                                </div>
                                                <input name="idproducto" type="text" class="form-control " aria-label="id" value="${p.idproducto}">
                                            </div>

                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text">Descripción</span>
                                                </div>
                                                <textarea class="form-control txt-area" name="descripcion" aria-label="Descripción">${p.descripcion}</textarea>
                                            </div>

                                            <div class="input-group">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text">Temporada</span>
                                                </div>
                                                <select id="select-temp" name="idCampana" placeholder="Seleccione la campaña" class="form-control" required>
                                                    <c:forEach var="c" items="${campana}">
                                                        <option value="${c.idCampana}" <c:if test="${c.idCampana == p.idCampana}">selected</c:if>/>
                                                        <c:out value="${c.campana}"/>
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-lg-3">
                                            <center><div>
                                                    <p><img alt="Imagen Producto" id="imgEdit" src="ObtenerImagen?cod=${p.idproducto}" class="img-thumbnail shadow-lg"></p>
                                                </div></center>
                                        </div>
                                    </div>
                                </div>

                                
                                <div class="modal-footer">
                                    <button type="submit" class="centrar btn btn-outline-dark btn-lg">Actualizar Producto</button>
                                </div>
                            </form>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
        <!--        <div class="row">
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
                                    <input type="file" name="logo" accept="image/*" src="ObtenerImagen?cod=${p.idproducto}">
                                    <img style="width: 75px" src="ObtenerImagen?cod=${p.idproducto}" alt="Imagen Produto">
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
</div>-->
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
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>    
    </body>
</html>
