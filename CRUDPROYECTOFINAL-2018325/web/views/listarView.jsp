<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="../dist/img/LOGO CPF.png?v=2">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <!--CSS-->
        <link rel="stylesheet" type="text/css" href="../dist/css/dataTables/bootstrap-tables.min.css">
        <link rel="stylesheet" href="../dist/css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="../dist/css/dataTables/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="../dist/css/fontawesome/css/all.min.css">
        <link rel="stylesheet" href="../dist/css/main.css">
        <!--Termina CSS-->
        <title>Listar</title>
    </head>
    <body>
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
                    <a href="#menu-toggle" class="float-left" id="menu-toggle"><i class="fas fa-bars" style="width: 15px; height: 15px;"></i></a>
                    <!--**** CONTENIDO AQUI *******-->
                    <div class="pt-5">
                        <table id="team" class="display table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Column 1</th>
                                <th>Column 2</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Row 1 Data 1</td>
                                <td>Row 1 Data 2</td>            
                            </tr>
                        </tbody>
                        </table>
                    </div>
                    <!--**** CONTENIDO AQUI *******-->
                </div>
            </div>
        </div>
        <!--Termina Side bar-->
    </body>
    <!--Scripts-->
    <script src="../dist/js/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script type="text/javascript" charset="utf8" src="../dist/js/dataTables/jquery.dataTables.min.js"></script>
    <script type="text/javascript" charset="utf8" src="../dist/js/dataTables/BootstrapDataTables.min.js"></script>
    <script>
        $("#menu-toggle").click(function (e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });
    </script>
    <script>
        $(document).ready( function () {
        $('#team').DataTable();
        } );
    </script>

    <script src="../dist/js/popper.min.js" type="text/javascript"></script>
    <script src="../dist/css/fontawesome/js/all.min.js" type="text/javascript"></script>
    <!--Terminan Scripts-->
</html>