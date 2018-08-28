<%--
    Document   : Galeria
    Created on : 17/08/2017, 19:28:02
    Author     : gusti
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width" initial-scale=1.0">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/stylegalerias.css">
        <!--        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>Galer�a</title>
    </head>
    <body>
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
        <h1 id="encabezado">GALER�A</h1>

    <center><div class="container-fluid">

            <div id="imagen">
                <a href="GaleriaInvierno.jsp"><div id="info">
                        <p id="headline">OTO�O/INVIERNO</p>
                        <p id="descripcion">2018</p>
                    </div>
                </a>
            </div>
            <div id="imagen1">
                <a href="Galeriaverano.jsp"><div id="info1">
                        <p id="headline1">PRIMAVERA/VERANO</p>
                        <p id="descripcion1">2018</p>
                    </div>
                </a>
            </div>

        </div></center>
    <br>
    <br>
    <br>
    <br>
    <br>
    

    <!--        <div class="container-fluid justify-content-center">
                
                        <div class="polaroid">
                            <div id="info">
                                <p id="OI">Oto�o/Invierno</p>
                                <p id="a�o">2018</p>
                            </div>
                            <a href="ObtenerProductoInvierno">
                                <img class="imgG" src="Image/invierno.JPG" style="width: 100%"></a>
                            
                        </div>
                        <div class="polaroid">
                            <a href="ObtenerProductoPrimaVerano">
                                <img src="Image/primav.JPG" style="width: 100%"></a>
                            
                        </div>          
            </div>-->


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
</body>
</html>
