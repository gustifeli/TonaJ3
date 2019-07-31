<%-- 
    Document   : modalImgCarousel
    Created on : 24/06/2019, 19:57:20
    Author     : gusti
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="Content/StylePortada.css">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <title>Modal</title>
    </head>
    <body>
        <nav id='nav' class="navbar navbar-dark">
            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="Image/maniqui1.png"></a>

            <i class="material-icons justify-content-end" style="font-size:30px; cursor:pointer" onclick="openNav()">
                more_vert
            </i>
            <div id="mySidenav" class="sidenav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                <a id="txtmenu" href="Galeria.jsp">GALERIA</a>
                <a id="txtmenu" href="Contactos.jsp">CONTACTO</a>
            </div>
        </nav>

        <!--modal-->
        <!--        <div class="modal fade"  id="modalPortada" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Nueva Imagen Portada</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <form method="post" action="agragarImagenPortada" enctype="multipart/form-data" onsubmit="return nvaPort()">
                                    <div class="container-fluid">
                                        <div class="row">
                                            <div class="col-lg-6">
                                                <div class="input-group">
                                                    <div class="input-group-prepend">
                                                        <span class="input-group-text input-span">Imagen</span>
                                                    </div>
                                                    <span class="logo" style="width: 0px">
                                                        <input class="file-input logo" id="logo" type="file" name="imgPort" accept="image/*" onchange="loadFile(event)">
                                                    </span>
                                                    <label for="logo" class="btn btn-outline-dark">
                                                        <span>Seleccionar el archivo</span>
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-lg-6">
                                                <p><img class="img-thumbnail shadow-lg centrar" id="previewImg" src="Image/nodisponible.png" alt="ImgPreview"></p>
                                            </div>
                                        </div>
                                    </div>
        
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-primary">Guardar</button>
                            </div>
                            </form>
        
                        </div>
                    </div>
                </div>-->
        <div class="container">
            <div id="card-contenedor" class="card">
                <!--                <div class="card-header">
                                    ...
                                </div>-->
                <div class="card-body">
                    <form method="post" action="agragarImagenPortada" enctype="multipart/form-data" onsubmit="return nvaPort()">
                        <div class="">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="input-group">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text input-span">Imagen</span>
                                        </div>
                                        <span class="logo" style="width: 0px">
                                            <input class="file-input logo" id="logo" type="file" name="imgPort" accept="image/*" onchange="loadFile(event)">
                                        </span>
                                        <label for="logo" class="btn btn-outline-dark">
                                            <span>Seleccionar el archivo</span>
                                        </label>
                                    </div>

                                </div>
                                <div class="col-lg-6">
                                    <p><img class="img-thumbnail shadow-lg centrar img-portada" id="previewImg" src="Image/nodisponible.png" alt="ImgPreview"></p>
                                </div>
                                <div class="botones">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                    <button type="submit" class="btn btn-primary">Guardar</button>
                                </div>
                            </div>
                        </div>

                    </form>
                </div>
            </div>

            <div id="card-contenedor" class="card">
                <div class="card-header">
                    <button type="button" class="btn btn-primary" onclick="location.href='CargarPortada'">
                        Nueva Portada
                    </button>
                </div>
                <div class="card-body">
                    <div class="col-md-12">
                        <c:forEach items="${portada}" var="p">

                            <div id="card-img" class="card" style="">
                                <img src="ObtenerImagenPortada?cod=${p.idFotoPortada}" class="card-img-top " alt="...">
                                <button id="btneliminar"  class="btn btn-outline-danger" onclick="alerta(${p.idFotoPortada})" ><i class="material-icons">delete_sweep</i></button>
                            </div>

                        </c:forEach>
                    </div> 
                </div>

            </div>
        </div>
        <script>
            var loadFile = function (event) {
                var output = document.getElementById('previewImg');
                output.src = URL.createObjectURL(event.target.files[0]);
            };

            function alerta(id) {
                var p = confirm("¿Esta seguro que desea eliminar la Portada?");
                if (p == true) {
                    location.href = "EliminarPortada?c=" + id;
                    alert("¡La Portada se elimino correctamente!");
                }
            }
        </script>

    </body>

    <!--Script function-->
    <c:if test="${not empty mensaje}">
        <script>
            function nvaPort() {
                alert("${mensaje}");
            }
        </script>
    </c:if>
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
</html>
