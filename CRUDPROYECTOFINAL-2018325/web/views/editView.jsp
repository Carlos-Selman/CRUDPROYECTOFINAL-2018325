  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../dist/css/bootstrap/bootstrap.min.css">
        <link rel="stylesheet" href="../dist/css/main.css">
        <link rel="stylesheet" href="../dist/css/fontawesome/css/all.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <title>Editar</title>
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
                <div class="col-1g-4">
                    <% 
                    PersonaDAO nuevaPersonaDao = new PersonaDAO ();
                    int codPersona = Ingerer.parseInt((String)request.getAtribute("codPer"));
                    Persona nuevaPersona = (Persona)nuevaPersonaDao.list(codPersona);
                    %> 
                    <h1>Editar Persona</h1>
                    <form action="Controlador">
                        <strong>DPI:</strong><br>
                        <input class="form-control" type="text" name=="txtDPI" value="<%=nuevaPersona.getDPI() %>"><br>
                        <strong>Nombres:</strong><br>
                        <input class="form-control" type="text" name="txtNombre" value="<%=nuevaPersona.getNombrePersona() %>"><br><br>
                        <input type="hidden" name="txtCodigoPersona" value="<%=nuevaPersona.getCodigoPersona()%>"><br>
                        <div class="text-center"><input class="btn btn-primary" type="submit" name="accion" value="Actualizar"></div>
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