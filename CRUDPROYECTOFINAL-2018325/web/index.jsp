<%-- 
    Document   : inde
    Created on : Oct 6, 2020, 2:45:12 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="dist/img/LOGO CPF.png?v=2">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Iniciar sesión</title>
    </head>
    <body style="background-color: #333;">
        <!-- Formulario de login -->
        <div class="container pt-5">
            <div class="row justify-content-center">
                <div class="col-sm-7">
                    <form class="text-center border p-5" action="Controlador" method="post" style="background-color: white;">
                        <p class="h4 mb-4">Inicia sesión</p>

                        <p>Ingresa a nuestro sitio web donde encontraras el mejor personal para tu empresa.</p>

                        <p><a href="" target="_blank">Enterate de los ultimos cambios</a></p>

                        <!-- Name -->
                        <input type="text" name="txtUser" class="form-control" id="txtusuario" placeholder="Ingrese su username..." required>
                        <br>
                        <!-- Password -->
                        <input type="password" name="txtPassword" class="form-control" id="txtpassword" placeholder="Ingrese su contraseña..." required>
                        <br>
                        <!-- Sign in button -->
                        <select class="browser-default custom-select" name="rol" required>
                            <option disabled selected="" value="">Escoge tu rol</option>
                            <option value=1>Administrador</option>
                            <option value=2>Usuario</option>
                        </select>
                        <small>Manipulacion de datos solo para <b>ADMINISTRADORES</b>.</small>
                        <br><br>
                        <input type="submit" name="accion" value="inicio" id="btnlogin" class="btn btn-primary w-100" onclick="add()"/>
                    </form>  
                </div>
            </div>
        </div>
        
        <!-- Termina Formulario de login -->
    </body>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <script src="dist/js/main.js"></script>
    <script>
        function add(){
            swal("Exito !", "Registro agregado correctamente!", "success");
        }
    </script>
</html>
