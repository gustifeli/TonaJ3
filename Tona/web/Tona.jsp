<%-- 
    Document   : Tona
    Created on : 17/08/2017, 19:32:36
    Author     : Julieta
--%>
<!DOCTYPE html>
<html id="htmlTona">
    <head >
        <meta charset="utf-8" http-equiv="Content-type" content="text/html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="Image/imgsolapa.png" />
        <link rel="shortcut icon" href="Image/imgsolapa.png" type="image/png"/>
        <title>TONA</title>
    </head>
    <body>
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
        <div id="carouselExampleIndicators" class="carousel slide carousel-fade" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="Image/tona.jpg" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="Image/tona1.jpg" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="Image/tona2.jpg" alt="Third slide">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <div>
            <footer class="footer">
                <nav id="nav" class=" navbar-inverse fixed-bottom">
                    <div id="txtfooter">
                        <p class="text-center credit txtbtn"> - TONA - Santa Eufemia, Cordoba, Argentina</p>
                        <div class="text-center img">
                            <a href="https://www.instagram.com/t.o.n.aa/?hl=es"> <img src="Image/Instagram.png"></a>
                            <a href="https://www.facebook.com/TONAAOFICIAL/?pnref=story"> <img src="Image/facebook.png"></a>
                        </div>
                    </div>
                </nav>
            </footer>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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

