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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/stylegalerias.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">-->        
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>Galería</title>    </head>
    <body>
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
        <h1 id="encabezado">GALERÍA</h1>
    <center>

        <div class="container">
            <img src="Image/invierno.JPG" class="image" style="" id="img0">
            <a href="ObtenerProductoInvierno">
                <div class="middle">
                    <div class="text">OTOÑO/INVIERNO</div>
                </div>
            </a>
        </div>
        <div class="container">
            <img src="Image/primav.jpeg" class="image" style="" id="img1">
            <a href="ObtenerProductoPrimaVerano">
                <div class="middle">
                    <div class="text">PRIMAVERA/VERANO</div>
                </div>
            </a>
        </div>

    </center>

    <!--    <center><div class="container-fluid">
    
                <div id="container">
                    <a href="ObtenerProductoInvierno">
                        <div id="info">
                            <p id="headline">OTOÑO/INVIERNO</p>
                            <p id="descripcion">2018</p>
                        </div>
                    </a>
                </div>
                <div id="container">
                    <a href="ObtenerProductoPrimaVerano"><div id="info1">
                            <p id="headline1">PRIMAVERA/VERANO</p>
                            <p id="descripcion1">2018</p>
                        </div>
                    </a>
                </div>
    
            </div></center>-->


    <!--        <div class="container-fluid justify-content-center">
                
                        <div class="polaroid">
                            <div id="info">
                                <p id="OI">Otoño/Invierno</p>
                                <p id="año">2018</p>
                            </div>
                            <a href="ObtenerProductoInvierno">
                                <img class="imgG" src="Image/invierno.JPG" style="width: 100%"></a>
                            
                        </div>
                        <div class="polaroid">
                            <a href="ObtenerProductoPrimaVerano">
                                <img src="Image/primav.JPG" style="width: 100%"></a>
                            
                        </div>          
            </div>-->


    <nav id="nav" class=" navbar-inverse">
        <div id="txtfooter">
            <p class="text-center credit txtbtn"> | TONA | Córdoba, Argentina</p>
            <div class="text-center img">
                <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>
            </div>
        </div>
    </nav>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
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
