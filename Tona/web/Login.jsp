<%-- 
    Document   : Login
    Created on : 17/08/2017, 18:51:13
    Author     : gusti
--%>
<%@taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- En caso de que exista una sesion iniciada redirecciono a index.jsp. "NO tiene caso mostrar este formulario cuando hay una sesion iniciada --%>
<t:if test="${sessionScope['sessionUser']!=null}">
    <% response.sendRedirect("ListaProducto");%>
</t:if>

<!DOCTYPE html>

<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link type="text/css" href="Content/bootstrap.css" rel="stylesheet">
        <link type="text/css" href="Content/styleLogReg.css" rel="stylesheet">
    </head>
    <!--    <body>
            <div id="table">
                <div id="">
                    <div id="">
                        <img src="Image/TONAlogin.png" >
                        <p style="color: #c9302c">${sessionScope['error']}</p>
                        <form action="LogIn" method="post">
                            <div class="form-group">
                                <label>Usuario </label>
                                <div class="col-lg-12">
                                    <input type="text"  name="name" placeholder="Ingrese su usuario" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Contraseña </label>
                                <div class="col-md-12">
                                    <input type="text" name="pass" placeholder="Ingrese su Contraseña" class="form-control"
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-offset-1 col-md-10 text-center">
                                    <input type="submit" value="Iniciar sesión" class="btn btn-danger" />
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
    
    
        </body>-->
    <body>
        <div class="background-transparent"></div>
    <center><div class="modal-content">
            <div class="modal-body">
                <img src="Image/TONAlogin.png" >
                <p style="color: #c9302c">${sessionScope['error']}</p>

                <form action="IniciarSesion" method="post">
                    <div class="input-group">
                            <span class="input-group-addon">Usuario</span>
                        <input name="name" type="text" class="form-control">
                    </div>
                    <div class="input-group">
                            <span class="input-group-addon">Contraseña</span>
                        <input name="pass" type="text" class="form-control">
                    </div>
                    <div>
                        <p style="color: #c9302c">${requestScope.msj}</p>
                    </div>
                    <div class="modal-footer" >
                        <div class="col-md-12 text-center">
                            <input type="submit" class="btn btn-outline-dark" value="Acceder">
                        </div>
                    </div>
                </form>
            </div>
        </div></center>
</body>
</html>

