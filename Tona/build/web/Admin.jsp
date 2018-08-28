<%-- 
    Document   : Admin
    Created on : 17/08/2017, 19:29:55
    Author     : Julieta
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${sessionScope['sessionUser']==null}">
    <%response.sendRedirect("Login.jsp");%>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>All Products</title>
    </head>
    <body background="Image/prueba.jpg">

        <!--        <script>
                    $("#btnEliminar").click(function(){
                    swal({
                    title:"confirmation",
                            text: "Esta Seguro",
                            icon: "warning",
                            buttons:true,
                            dangerMode: true,
                    })
                            .then((delete) => {
                            if (delete){
                            function(){
                            var id = document.getElementById("btnEliminar").value;
                            window.location.href = 'EliminarProducto?cod=' + id;
                            }
                            swal('Perfecto! El Producto se elimino correctamente!', {
                            icon: "success",
                                    )};
                            } else{
                            swal('El producto no se eliminó!')
                            }
                            });
                            });
                </script>-->
        <nav id='nav' class="navbar navbar-dark">

            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="Image/maniqui.png"></a>

            <div class="user fixed">
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="transparent"><i class="material-icons sm-dark sm-inactive">account_circle</i></span>
                    </div>
                    <input id="transparent" type="text" class="form-control" value="${sessionScope['sessionUser']}" disabled="true" aria-label="Username" aria-describedby="basic-addon1">
                    <form action="Logout" method="post">
                        <button class="btn btn-sm btn-outline-danger"  type="submit"><i class="material-icons sm-dark sm-inactive">power_settings_new</i></button>                            
                    </form>
                </div>
            </div>
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
        <h1 id="encabezado"> Productos</h1>
        <div class="container-fluid">
            <a role="button" type="button" href="obtenerCampana" class="btn btn-agregar btn-ttc"><i class="material-icons sm-dark">add_circle_outline</i> Producto</a>
            <div class="panel-body">
                <table class="table table-responsive table-hover">
                    <thead class="thead-dark">
                        <tr>
                            <th hidden="true" scope="col">Cod.</th>
                            <th class="rowWidth" scope="col">Imagen</th>
                            <th style="width: 76%" scope="col">Descripción</th>
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
                                <td><form action="BuscarProductoCod?cod=${p.idproducto}" method="post"><button role="button" class="btn btn-outline-primary" type="submit">Editar</button></form></td>
                                <td><form action="EliminarProducto?cod=${p.idproducto}" method="post"><button role="button" id="btnEliminar" class="btn btn-outline-danger" type="submit">Eliminar</button></form></td>

                                <!--START TEST-->
                                <!--<td><a role="button" id="btnEliminar" class="btn btn-danger" value="${p.idproducto}" type="button">Eliminar</a></td>-->
                                <!--END TEST-->
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div>
            <footer class="footer">
                <div>
                    <nav id="nav" class=" navbar-inverse fixed-bottom">
                        <div id="txtfooter">
                            <p class="text-center credit txtbtn">- TONA - Santa Eufemia, Cordoba, Argentina</p>
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
    </body>
</html>
