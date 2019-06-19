<%-- 
    Document   : Contactos
    Created on : 17/08/2017, 19:27:05
    Author     : gusti
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/stylecontacto.css">
        <!--<link type="text/css" href="Content/bootstrap.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>Contacto</title>
    </head>
    <body background="Image/prueba.jpg">
        <!--        <script type="text/javascript">
                    window.onload = function () {
                        alert("El mensaje se envio con exito");
                    };
                </script>-->
        <nav id='nav' class="navbar navbar-dark fixed-top">
            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="Image/maniqui1.png"></a>
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
        <h1 id="contacto">CONTACTO</h1>
        <div class="container-fluid">
            <form method="post" action="Contact">
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-contacts">
                            <div class="form-group">
                                <label id="label">Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre"  required="true">
                                <small id="emailHelp" class="form-text txt-obligatorio">Campo obligatorio.</small>
                            </div>
                            <div class="form-group">
                                <label id="label">Apellido</label>
                                <input class="form-control" type="text" id="apellido" name="apellido" required="true">
                                <small id="emailHelp" class="form-text txt-obligatorio">Campo obligatorio.</small>
                            </div>
                            <div class="form-group">
                                <label id="label">Email</label>
                                <input class="form-control" type="text" id="email" name="email" required="true">
                                <small id="emailHelp" class="form-text txt-obligatorio">Campo obligatorio.</small>
                            </div>
                            <div class="form-group">
                                <label id="label">Telefono</label>
                                <input class="form-control" type="text" id="telefono" name="telefono">
                            </div>
                            <div class="form-group">
                                <label id="label">Localidad</label>
                                <input class="form-control" type="text" id="localidad" name="localidad">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-contacts">
                            <div class="form-group">
                                <label id="label">Mensaje</label>
                                <textarea class="form-control" name="comentario" rows="7" cols="40" id="comentario"></textarea>
                                <small class="form-text txt-obligatorio">Campo Obligatorio</small>
                                <div id="clear">
                                    <input name="sumbit" type="submit" class="button boton" id="sumbit_contacto" value="ENVIAR" />
                                    <p class="ocultar">
                                        Para comunicarte,completá el formulario, o envianos un mail a la siguiente dirección:
                                        <a href="mailto:tonaoficial@hotmail.com" class="linea">tonaoficial@hotmail.com</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div>
            <footer class="footer">
                <div>
                    <nav id="nav" class=" navbar-inverse fixed-bottom">
                        <div id="txtfooter">
                            <p class="text-center credit txtbtn"> - TONA - Santa Eufemia, Cordoba, Argentina</p>
                            <div class="text-center img">
                                <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                                <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>
                            </div>
                        </div>
                    </nav>
                </div>
            </footer>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="Scripts/bootstrap.min.js"></script>
    </body>
</html>
