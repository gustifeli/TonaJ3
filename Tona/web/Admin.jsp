<%--
    Document   : Admin
    Created on : 17/08/2017, 19:29:55
    Author     : Julieta
--%>
<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${sessionScope['sessionUser']==null}">
    <%response.sendRedirect("Login.jsp");%>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>All Products</title>
    </head>
    <body class="background-admin" style="background-attachment: fixed;">
        <nav id='nav' class="navbar navbar-dark">

            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="Image/maniqui1.png"></a>

            <div class="input-group-sm">
                <input type="text" class="form-control" value="${sessionScope['sessionUser']}" disabled="true" aria-label="Username" aria-describedby="basic-addon1">
                <i id="user" class="material-icons sm-dark sm-inactive">account_circle</i>
                <form action="Logout" method="post">
                    <button id="botp" class="btn btn-danger btn-circle"  type="submit"><i id="power" class="material-icons sm-dark sm-inactive">power_settings_new</i></button>
                </form>
            </div>
            <!--            <form action="Logout" method="post">
                            <button id="btn-circle" class="btn btn-default"  type="submit"><i id="power" class="material-icons sm-dark sm-inactive">power_settings_new</i></button>
                        </form>-->
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
        <h1 id="encabezadoAdmin">PRODUCTOS</h1>      
        <div class="container-fluid">         
            <div class="panel-group table-wrapper-scroll-y">
                <!--                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalPortada">
                                    Nueva Portada
                                </button>-->

                <button class=" btn btn-outline-secondary" onclick="location.href = 'obtenerPortada'" type="button" style="float: right; display: inline-block !Important; margin-bottom: 3px; height: 40px; margin-left: 5px;"> + Portada</button>
                <button onclick="location.href = 'obtenerCampana'" type="button" class="btn btn-outline-primary" style="float: right;  display: inline-block !Important; margin-bottom: 3px; height: 40px; border-radius: 5px;"><i class="material-icons">add_circle_outline</i></button>
                <div class="table-responsive">
                    <table class="table">
                        <thead class="thead-dark" >
                            <tr>
                                <th hidden="true" scope="col">Cod.</th> 
                                <th class="rowWidth" scope="col">Imagen</th>
                                <th style="width: 60%" scope="col">Descripción</th>
                                <th hidden="true" scope="col">CodCamp</th>
                                <th scope="col">Campaña</th>
                                <th class="rowWidth" scope="col"></th>
                                <th class="rowWidth" scope="col"></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${producto}" var="p">
                                <tr>
                                    <td hidden="true"><c:out value="${p.idproducto}"/></td>
                                    <td><img style="width: 70px" src="ObtenerImagen?cod=${p.idproducto}" alt="imagenProducto"></td>
                                    <td><c:out value="${p.descripcion}"/></td>
                                    <td hidden="true"><c:out value="${p.idCampana}"/></td>
                                    <td><c:out value="${p.campana}"/></td>
                                    <!--<td><form action="BuscarProductoCod?cod=${p.idproducto}" method="post"><button role="button" class="btn btn-outline-primary" type="submit">Editar</button></form></td>-->
                                    <!--<td><form action="EliminarProducto?cod=${p.idproducto}" method="post"><button role="button" id="btnEliminar" class="btn btn-outline-danger" type="submit">Eliminar</button></form></td>-->


                                    <!--START TEST-->
                                    <td><button id="btnModif" class="btn btn-outline-primary" onclick="modifAlert(${p.idproducto})" value="${p.idproducto}"><i class="material-icons">edit</i></button></td>
                                    <td><button id="btnEliminar" class="btn btn-outline-danger" onclick="alerta(${p.idproducto})" value="${p.idproducto}"><i class="material-icons">delete_sweep</i></button></td>
                                    <!--END TEST-->
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div>
            <footer class="footer">
                <div>
                    <nav id="nav" class=" navbar-inverse">
                        <div id="txtfooter">
                            <p class="text-center credit txtbtn">- TONA - Santa Eufemia, Cordoba, Argentina</p>
                            <div class="text-center img">
                            </div>
                        </div>
                    </nav>
                </div>
            </footer>
        </div>
        <!--modal-->
        <div class="modal fade"  id="modalPortada" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="">
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
                                    <div class="col-lg-9">
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
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <p><img class="img-thumbnail shadow-lg centrar" id="previewImg" src="Image/nodisponible.png" alt="ImgPreview"></p>
                            </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                        <button type="submit" class="btn btn-primary">Guardar</button>
                    </div>
                    </form>

                </div>
            </div>
        </div>
        <script>

            function alerta(id) {
                var p = confirm("Â¿Esta seguro que desea eliminar el producto?");
                if (p == true) {
                    location.href = "EliminarProducto?cod=" + id;
                    alert("Â¡El producto se elimino con Ã©xito!");
                }
            }

            function modifAlert(id) {
                var p = confirm("Â¿Esta seguro que desea modificar el producto?");
                if (p == true) {
                    location.href = "BuscarProductoCod?cod=" + id;
                }
            }
        </script>
        <!--funcion para cargar la preview-->
        <script>
            var loadFile = function (event) {
                var output = document.getElementById('previewImg');
                output.src = URL.createObjectURL(event.target.files[0]);
            };
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
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
        <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
    </body>
</html>
