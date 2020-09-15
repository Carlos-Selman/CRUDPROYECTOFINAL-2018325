<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../dist/css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="../dist/css/main.css">
        <link rel="stylesheet" href="../dist/css/fontawesome/css/all.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <title>Sidebar</title>
    </head>
    <body>
       <!--Empieza Side bar-->
       <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#" class="text-center">
                        <img src="../dist/img/logo.png" class="img-responsive img-circle logo-img">
                    </a>
                </li>
                <div class="links">
                    <li>
                        <a href="#">Inicio</a>
                    </li>
                    <li>
                        <a href="#">Listar</a>
                    </li>
                    <li>
                        <a href="#">Agregar</a>
                    </li>
                </div>
            </ul>
        </div>
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
              <a href="#menu-toggle" class="float-right" id="menu-toggle"><i class="fas fa-bars" style="width: 15px; height: 15px;"></i></a>
                <!--**** CONTENIDO AQUI *******-->
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
