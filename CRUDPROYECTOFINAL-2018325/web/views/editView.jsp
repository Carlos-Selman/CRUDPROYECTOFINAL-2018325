  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../dist/css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="../dist/css/main.css">
        <link rel="stylesheet" href="../dist/css/fontawesome/css/all.min.css">
        <link rel="icon" href="../dist/img/LOGO CPF.png?v=2">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <title>Editar</title>
    </head>
    <body class="color-section">
       <!--Empieza Side bar-->
       <div id="wrapper">
        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#" class="text-center">
                       <center><img src="../dist/img/LOGO CPF.png" class="img-responsive img-circle logo-img"></center>
                    </a>
                </li>
                    <div class="links">
                        <li>
                            <a href="../index.html">Inicio</a>
                        </li>
                        <li>
                            <a href="listarView.jsp">Listar</a>
                        </li>
                        <li>
                            <a href="addView.jsp">Agregar</a>
                        </li>
                    </div>
            </ul>
        </div>
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
              <a href="#menu-toggle" class="float-right" id="menu-toggle"><i class="fas fa-bars" style="width: 15px; height: 15px;"></i></a>
                <!--**** CONTENIDO AQUI *******-->
                   <div class="container form-center">
                        <div class="col-lg-4">
                            <h1>Editar Persona</h1>
                            <form action="Controlador">
                                <strong>DPI:</strong><br>
                                <input class="form-control" type="text" name="txtDPI"><br>
                                <strong>Nombres:</strong><br>
                                <input class="form-control" type="text" name="txtNombres"><br><br>
                                <div class="text-center"><input class="btn btn-success btn-lg" type="submit" name="accion" value="Actualizar"></div>
                            </form>
                        </div>
                    </div>
                <!--**** CONTENIDO AQUI *******-->
            </div>
        </div>
    </div>
       <!--Termina Side bar-->
    </body>
    <!--Scripts-->
    <script src="../dist/js/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script>
         $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
    <script src="../dist/js/popper.min.js" type="text/javascript"></script>
    <script src="../dist/css/fontawesome/js/all.min.js" type="text/javascript"></script>

    <!--Terminan Scripts-->
</html>
