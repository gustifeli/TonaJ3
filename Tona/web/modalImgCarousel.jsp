<%-- 
    Document   : modalImgCarousel
    Created on : 24/06/2019, 19:57:20
    Author     : gusti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Content/stylegeneral.css">
        <link rel="stylesheet" href="Content/styleAddProducto.css">
        <title>Modal</title>
    </head>
    <body>
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            Launch demo modal
        </button>
        <div class="modal fade"  id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Nueva Imagen Portada</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="" method="">
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
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script>
        var loadFile = function (event) {
            var output = document.getElementById('previewImg');
            output.src = URL.createObjectURL(event.target.files[0]);
        };
    </script>
</html>
