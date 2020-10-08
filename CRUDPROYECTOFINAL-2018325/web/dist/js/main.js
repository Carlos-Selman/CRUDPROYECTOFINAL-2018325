$("#menu-toggle").click(function(e) {
	e.preventDefault();
	$("#wrapper").toggleClass("toggled");
});
$(document).ready(function() {
	$('#team').DataTable();
});

function erase(){
    alert('Elemento borrado con exito !!');
}

window.addEventListener('load', ()=>{
   document.getElementById('btnlogin').addEventListener('click', ()=>{
        var nombre  = document.getElementById('txtusuario').value;
        var contra  = document.getElementById('txtpassword').value;
        var rols     = document.getElementById('rol').value;
        
        var bandera = false;
       
        if ( nombre.length > 0 && contra.length > 0 && typeof(rols)!==""  ) {
            bandera = true;
        }
       
        if ( bandera ) {
            document.getElementById('iniciar').submit();
        } else {
            alert('Por favor llenar todos los campos');
        }
   });
});
