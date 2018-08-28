<%-- 
    Document   : PRUEBA
    Created on : Jun 7, 2018, 5:48:19 PM
    Author     : Julieta
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="stylesheet" href="../Content/stylegeneral.css">
        <link rel="stylesheet" href="../Content/stylegeneral.css">
        <title>JSP Page</title>
        <style>
            label{margin-right: 10px;}
            #tabla1{text-align: center; margin-top: 5%; padding-right: 0px;}
            #tabla2{margin-top: 5%; vertical-align: central; padding-left: 15px; height: 100%;}
            .form-row{width: 100%; height: 100%;}
            textarea{height: 100px;}
            #clear {margin-left: auto; margin-right: auto; text-align: center;}
            .boton {background-color: white; color: black; border: 2px solid #000; border-radius: 3px; margin-bottom: 10px; outline: none;}
            .boton:hover {background-color: #000; color: white;}
            p{ margin: 0;}
            #email{margin-left: 23.01px;}
            #nombre{margin-left: 8.72px;}
            #apellido{margin-left: 8.65px;}
            #telefono{margin-left: 6.3px;}

        </style>
    </head>
    <body background="../Image/prueba.jpg">
        <nav id='nav' class="navbar navbar-dark">
            <a href="Tona.jsp" id="TONA" class="navbar-brand">TONA</a>
            <a href="Login.jsp" class="navbar-brand"><img id="img" src="../Image/maniqui.png"></a>
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

        <div class="form-row justify-content-center">
            <div id="tabla1" class="col">
                <div class="form-group">
                    <label>* Nombre:</label>
                    <input type="text" class="form-control-md" id="nombre" name="nombre" autofocus="nombre">
                </div>
                <div class="form-group">
                    <label>* Apellido:</label>
                    <input type="text" class="form-control-md" id="apellido" name="apellido">
                </div>
                <div class="form-group">
                    <label>* E-mail:</label>
                    <input type="text" class="form-control-md" id="email" name="email">
                </div>
                <div class="form-group">
                    <label>* Teléfono:</label>
                    <input type="text" class="form-control-md" id="telefono" name="telefono">
                </div>
                <div class="form-group">
                    <label>* Localidad:</label>
                    <input type="text" class="form-control-md" id="localidad" name="localidad">
                </div>
                <p>* Datos obligatorios</p>
            </div>
            <div id="tabla2" class="col">
                <div class="form-group">
                    <label>* Mensaje:</label>
                    <textarea class="form-control" id="comentario" name="comentario" row="7" cols="40"></textarea>
                </div>
                <div id="clear" class="justify-content-center">
                    <input name="sumbit" type="submit" onclick="send()" class="button boton" id="sumbit_contacto" value="ENVIAR" />
                    <p class="ocultar">
                        Para comunicarte,completá el formulario, o envianos un mail a la siguiente dirección:
                        <a href="mailto:tonaoficial@hotmail.com" class="linea">tonaoficial@hotmail.com</a>
                    </p>
                    <br>
                    <br>
                    <br>
                </div>
            </div>
        </div>
        <footer class="footer">
            <nav id="nav" class=" navbar-inverse fixed-bottom">
                <div id="txtfooter">
                    <p class="text-center credit txtbtn">- TONA - Santa Eufemia, Cordoba, Argentina</p>
                    <div class="text-center img">
                        <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                        <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>
                    </div>
                </div>
            </nav>
        </footer>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    </body>
</html>
