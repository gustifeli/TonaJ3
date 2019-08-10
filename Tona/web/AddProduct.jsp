<%-- 
    Document   : AddProduct
    Created on : 17/08/2017, 19:26:45
    Author     : Julieta
--%>

<%@page import="org.springframework.web.context.request.SessionScope"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>+ - Producto</title>
    </head>
    <body background="Image/prueba.jpg">
        <nav id='nav' class="navbar navbar-dark">

            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="Image/maniqui1.png"></a>

            <i id="menus" class="material-icons justify-content-end" style="font-size:30px;cursor:pointer" onclick="openNav()">
                more_vert
            </i>
            <div id="mySidenav" class="sidenav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                <a id="txtmenu" href="Galeria.jsp">GALERIA</a>
                <a id="txtmenu" href="Contactos.jsp">CONTACTO</a>
            </div>
            <!--            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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
                        </div>-->
        </nav>
<!--        <div class="modals">-->
<div class="container-fluid" id="nvoproducto">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 id="encabezado" class="modal-title ">NUEVO PRODUCTO</h3>
                    </div>
                    <div class="modal-body">
                        <form method="post" action="AddProd" enctype="multipart/form-data" onsubmit="return newProducto()">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-lg-9">
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text">Descripción</span>
                                            </div>
                                            <textarea name="descripcion" placeholder="Ingrese la descripción" id="" cols="30" rows="3" class="form-control"></textarea>
                                        </div>
                                        <div class="input-group">
                                            <div class="input-group-prepend">
                                                <span class="input-group-text input-span">Imagen</span>
                                            </div>
                                            <span class="logo" style="">
                                                <input class="file-input logo" id="logo" type="file" name="logo" accept="image/*" onchange="loadFile(event)">
                                            </span>
                                            
                                            <label for="logo" class="btn btn-outline-dark" id="uparchivo">
                                                <span>Seleccionar el archivo</span>
                                            </label>
                                        </div>
                                        <div class="form-group">
                                            <select name="idCampana" placeholder="Seleccione la campaña" class="form-control" required>
                                                <c:forEach var="c" items="${campana}">
                                                    <option value="${c.idCampana}"/>
                                                    <c:out value="${c.campana}"/>
                                                    </option>
                                                </c:forEach>
                                            </select>
                                        </div>                                       
                                    </div>

                                    <div class="col-lg-3">
                                        <p><img class="img-thumbnail shadow-lg centrar" id="previewImg" src="Image/nodisponible.png" alt="ImgPreview"></p>
                                    </div>
                                </div>
                            </div>

                            <div class="modal-footer">
                                <button type="submit" id="save" class="btn btn-outline-dark centrar">Guardar Producto</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        <!--</div>-->


        <!--        <div class="row">
                    <div class="col-xs-0 col-md-3"></div>
                    <div id="cont" class="col-xs-12 col-md-6">
                        <form method="post" action="AddProd" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for="titulo" style="font-size: 2em;"><strong>Producto:</strong></label>
                            </div>
                            <div class="form-group">
                                <label for="titulo">Descripcion</label>
                                <textarea class="form-control" name="descripcion" rows="3" placeholder="Descripción"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="titulo">Imagen</label>
                                <div>
                                    <table class="table">
                                        <tr>
                                            <th style="text-align: left; vertical-align: middle; width: 20%;">
                                                <input type="file" name="logo" accept="image/*">
                                                <select name="idCampana" placeholder="Seleccione la <campaña" class="form-control" required>
        <c:forEach var="c" items="${campana}">
            <option value="${c.idCampana}"/>
            <c:out value="${c.campana}"/>
            </option>
        </c:forEach>
    </select>
</th>
</tr>
</table>
<center><div>
<p><img id="imgMin" src="Image/tona.jpg" class="img-rounded"></p>
</div></center>
</div>
</div>
<div class="form-group">
<div>
<table class="table">
<tr>
<th style="text-align: center; vertical-align: middle; width: 50%;">
    <p><button type="submit" class="btn btn-ttc" onclick="msj()">Cargar Producto</button></p>
</th>
</tr>
</table>
</div>
</div>
</form>
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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>      

        <!--Script function-->
        <c:if test="${not empty mensaje}">
            <script>
                                                    function newProducto() {
                                                        alert("${mensaje}");
                                                    }
            </script>
        </c:if>

        <!--funcion para cargar la preview-->
        <script>
            var loadFile = function (event) {
                var output = document.getElementById('previewImg');
                output.src = URL.createObjectURL(event.target.files[0]);
            };
        </script>
        <script>
     function openNav() {
         document.getElementById("mySidenav").style.width = "150px";
        }
     function closeNav() {
         document.getElementById("mySidenav").style.width = "0";
         document.getElementById("main").style.marginRight = "0";
         document.body.style.backgroundColor = "white";
     }
        </script> 
    <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
    </body>
</html>
