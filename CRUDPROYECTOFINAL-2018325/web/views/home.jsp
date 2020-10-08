<%@page import="model.loginModel"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="dist/img/LOGO CPF.png?v=2">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <!--CSS-->
        <link rel="stylesheet" type="text/css" href="dist/css/dataTables/bootstrap-tables.min.css">
        <link rel="stylesheet" href="dist/css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="dist/css/main.css">
        <link rel="stylesheet" type="text/css" href="dist/css/dataTables/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="dist/css/fontawesome/css/all.min.css">
        <link rel="stylesheet" href="dist/css/global.css">
        <!--Termina CSS-->
        <title>CRUD Proyecto Final</title>
    </head>
    <body>        
        <!--Empieza Side bar-->
        <div id="wrapper">

            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav">
                    <li class="sidebar-brand">
                        <a href="#" class="text-center">
                            <center><img src="dist/img/LOGO CPF.png" class="img-responsive img-circle logo-img"></center>
                        </a>
                    </li>
                    <div class="links">
                        <li>
                            <a href="Controlador?accion=home"><i class="fas fa-home" style="padding-right: 5px; color: white; font-size: 18pt"></i>Inicio</a>
                        </li>
                        <li>
                            <a href="Controlador?accion=listar"><i class="fas fa-clipboard-list" style="padding-right: 5px; color: white; font-size: 22pt;"></i>Listar</a>
                        </li>
                        <%
                            String action = request.getParameter("accion");
                            String displays = "";
                            
                            if ( action.equalsIgnoreCase("inicio") ) {
                                String rol = request.getParameter("rol");
                                System.out.println(rol);
                                if( rol.equalsIgnoreCase("1") ) {
                                    displays = "enable";
                                } else {
                                    displays = "disabled";
                                }
                            }
                        %>
                        <li class="<%=displays%> <%out.println(request.getAttribute("homess"));%>">
                            <a href="Controlador?accion=add"><i class="fas fa-plus" style="padding-right: 5px; color: white; font-size: 22pt;"></i>Agregar</a>
                        </li>
                        <li>
                            <a href="Controlador?accion=login"><i class="fas fa-sign-in-alt" style="padding-right: 5px; color: white; font-size: 22pt;"></i>cerrar sesi�n</a>
                        </li>
                    </div>
                </ul>
            </div>
            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <a href="#menu-toggle" class="float-left" id="menu-toggle"><i class="fas fa-bars" style="width: 15px; height: 15px;"></i></a>
                    <!--**** CONTENIDO AQUI *******-->
                    <h1 class="text-center">CRUD Proyecto Final</h1>
                    <div class="pt-5">
                        <table id="team" class="display table table-striped table-bordered text-center">
                        <thead>
                            <tr>
                                <th class="text-center">No.</th>
                                <th class="text-center">Nombres</th>
                                <th class="text-center">Apellidos</th>
                                <th class="text-center">Carn�</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Carlos Andr�s</td>
                                <td>Selman David</td>
                                <td>2018325</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Mart�n Alejandro</td>
                                <td>Tec�n Charles</td>
                                <td>2016228</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>Antony Josu�</td>
                                <td>Toribio P�rez</td>
                                <td>2019038</td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>Oscar Joaqu�n</td>
                                <td>Si�n Or�n</td>
                                <td>2019017</td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>Juan Jos�</td>
                                <td>Rodas Mansilla</td>
                                <td>2016262</td>
                            </tr>
                            <tr>
                                <td>6</td>
                                <td>Jos� Andr�s</td>
                                <td>Subuyuj Guzm�n</td>
                                <td>2016243</td>
                            </tr>
                            <tr>
                                <td>7</td>
                                <td>Jorge Eduardo</td>
                                <td>Morataya Socop</td>
                                <td>2019041</td>
                            </tr>
                            <tr>
                                <td>8</td>
                                <td>Luis Rodrigo</td>
                                <td>Morales Flori�n</td>
                                <td>2019047</td>
                            </tr>
                            <tr>
                                <td>9</td>
                                <td>Jos� Alejandro</td>
                                <td>Zu�iga Collado</td>
                                <td>2016497</td>
                            </tr>
                            <tr>
                                <td>10</td>
                                <td>Fredy Jos� Daniel</td>
                                <td>Reyes Saban</td>
                                <td>2019035</td>
                            </tr>
                            <tr>
                                <td>11</td>
                                <td>Jeffry Alexander</td>
                                <td>Ordo�ez Pacheco</td>
                                <td>2019042</td>
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
    <script  type="text/javascript" src="dist/js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="dist/js/dataTables/jquery.dataTables.min.js"></script>
    <script type="text/javascript" charset="utf8" src="dist/js/dataTables/BootstrapDataTables.min.js"></script>
    <script src="dist/js/main.js" type="text/javascript"></script>
    <script src="dist/js/popper.min.js" type="text/javascript"></script>
    <script src="dist/css/fontawesome/js/all.min.js" type="text/javascript"></script>
    <!--Terminan Scripts-->
</html>