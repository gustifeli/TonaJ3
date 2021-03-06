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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <!--        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>-->
        <link rel="stylesheet" href="https://material-components.github.io/material-components-web-catalog/static/css/styles/App.scss">
        <link rel="stylesheet" href="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css">
        <link rel="stylesheet" href="Content/stylegalerias.css">

        <title>Galer�a</title>


    </head>

    <nav id='nav' class="navbar navbar-dark fixed-top">

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
    <div>
        <h1 id="encabezado" class="container-fluid">TEMPORADA OTO�O-INVIERNO</h1>
    </div>
    <div class="masonry-container-image">

        <ul class="mdc-image-list mdc-image-list--masonry my-masonry-image-list">
            <c:forEach items="${producto}" var="p">
                <li class="mdc-image-list__item">
                    <div class="mdc-card">

                        <img id="myImg" class="mdc-image-list__image img-rounded" onclick="agrandarImg(this);" src="ObtenerImagenGaleriaInvierno?cod=${p.idproducto}" alt="${p.descripcion}">

                        <div class="mdc-image-list__supporting">
                            <p class="text-card"><c:out value="${p.descripcion}"/></p>
                        </div>
                        <div class="divisor">
                            <div class="mdc-card__action-icons">
                                <button type="button" class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon"
                                        id="btnEnviar" onclick="enviarMensaje(${p.idproducto}, '${p.descripcion}', ${p.idCampana})">send</button>
                                <!--<button type="button"  class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" id="btnZoom">zoom_out_map</button>-->
                            </div>
                        </div>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>

    <!--Modal Enviar Mensaje-->
    <div class="modal fade" id="modal-enviar" tabindex="-1" role="dialog" aria-hidden="true" aria-labelledby="modal-enviar">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header modal-header-color">
                    <h3 class="modal-title" id="modal-enviar">Enviar Consulta</h3>
                    <button type="button" id="boton" class="close" data-dismiss="modal" aria-label="close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form method="post" action="Contact">
                    <div class="modal-body">
                        <div class="form-contacts">
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre"  required="true">
                                <small id="emailHelp" class="form-text txt-obligatorio">*Campo obligatorio.</small>
                            </div>
                            <div class="form-group">
                                <label>Apellido</label>
                                <input class="form-control" type="text" id="apellido" name="apellido" required="true">
                                <small id="emailHelp" class="form-text txt-obligatorio">*Campo obligatorio.</small>
                            </div>
                            <div class="form-group">
                                <label>Email</label>
                                <input class="form-control" type="text" id="email" name="email" required="true">
                                <small id="emailHelp" class="form-text txt-obligatorio">*Campo obligatorio.</small>
                            </div>
                            <div class="form-group">
                                <label>Telefono</label>
                                <input class="form-control" type="text" id="telefono" name="telefono">
                            </div>
                            <div class="form-group">
                                <label>Localidad</label>
                                <input class="form-control" type="text" id="localidad" name="localidad">
                            </div>
                            <div class="form-group">
                                <label>Mensaje</label>
                                <div class="consulta-msj">
                                    <input name="msj" id="msj" type="text"  class="form-control inp" disabled="true" >
                                    <textarea class="form-control txtarea" name="comentario" rows="3" cols="40" id="comentario"></textarea>
                                </div>
                                <small class="form-text txt-obligatorio">*Campo Obligatorio</small>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <div id="clear">

                            <input name="sumbit" type="submit" onclick="send()" class="btn btn-outline-dark" id="sumbit_contacto" value="ENVIAR" />

                            <p class="ocultar">
                                Para comunicarte,complet� el formulario, o envianos un mail a la siguiente direcci�n:
                                <a href="mailto:tonaoficial@hotmail.com" class="linea">tonaoficial@hotmail.com</a>
                            </p>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!--Modal Vista Previa producto-->

    <div id="imgModal" class="modal-img">
        <spam onclick="imgModal.style.display = 'none'" class="closebtn">&times;</spam>
        <img class="modal-content responsive" id="img01">
        <div id="caption"></div>
    </div>

    <script>
        function agrandarImg(imgs) {
            var modal = document.getElementById("imgModal")
            var imgGrande = document.getElementById("img01");
            var imgTexto = document.getElementById("caption");
            imgGrande.src = imgs.src;
            imgTexto.innerHTML = imgs.alt;
            modal.style.display = "Block";
        }

    </script>

    <nav id="nav" class=" navbar-inverse">
        <div id="txtfooter">
            <p class="text-center credit txtbtn">- TONA - Santa Eufemia, Cordoba, Argentina</p>
            <div class="text-center img">
                <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>
            </div>
        </div>
    </nav>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    <script>
        function enviarMensaje(id, desc, idCampana) {
            $(document).ready(function () {
//                    $("#btnEnviar").click(function () {
                $("#modal-enviar").modal();
//                    location.href = "ObtenerProductoMensaje?cod=" + id;
                document.getElementById("msj").value = 'Ingrese su consulta sobre el Producto: ' + desc + ' Cod.: ' + id + "...";
//                    });
            });
        }
    </script>
    <script src="https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js"></script>
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