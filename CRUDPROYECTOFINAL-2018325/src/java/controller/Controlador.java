package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Persona;
import model.loginModel;
import modelDAO.PersonaDAO;
import modelDAO.login;
public class Controlador extends HttpServlet {
    //Variables de clase
    int codigoPersona;
    String js = "confirm('Estas seguro de eliminarlo')";
    String home = "views/home.jsp";
    String listar = "views/listarView.jsp";
    String add = "views/addView.jsp";
    String edit = "views/editView.jsp";
    String index = "/";
    Persona nuevaPersona = new Persona();
    PersonaDAO nuevaPersonaDao = new PersonaDAO();
    loginModel l = new loginModel();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        
        if(action.equalsIgnoreCase("home") && l.getRols().equals("1")){
            acceso = home;
            request.setAttribute("homess", "enable");
        } else if(action.equalsIgnoreCase("home") && l.getRols().equals("2")){
            acceso = home;
            request.setAttribute("homess", "disabled");
        }else if( action.equalsIgnoreCase("add") && l.getRols().equalsIgnoreCase("1") ){
            acceso = add;
        }else if(action.equalsIgnoreCase("listar") && l.getRols().equalsIgnoreCase("1")){
            acceso = listar;
            request.setAttribute("listars", "enable");
        } else if(action.equalsIgnoreCase("listar") && l.getRols().equalsIgnoreCase("2")){
            acceso = listar;
            request.setAttribute("listars", "disabled");
        }else if(action.equalsIgnoreCase("agregar") && l.getRols().equalsIgnoreCase("1")){
            String DPI = request.getParameter("txtDPI");
            String NombreP = request.getParameter("txtNombres");
            Persona NuevaPersona = new Persona();
            NuevaPersona.setDPI(DPI);
            NuevaPersona.setNombrePersona(NombreP);
            PersonaDAO nuevaPersonaDAO = new PersonaDAO();
            nuevaPersonaDAO.add(NuevaPersona);
            try {
                Thread.sleep(2000);
                acceso = listar;
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(action.equalsIgnoreCase("editar") && l.getRols().equalsIgnoreCase("1")){
            request.setAttribute("codPer",request.getParameter("codigoPersona"));
            acceso = edit;
        }else if(action.equalsIgnoreCase("actualizar") && l.getRols().equalsIgnoreCase("1")){
            codigoPersona = Integer.parseInt(request.getParameter("txtCodigoPersona"));
            String DPI = request.getParameter("txtDPI");
            String Nombre = request.getParameter("txtNombres");
            nuevaPersona.setCodigoPersona(codigoPersona);
            nuevaPersona.setDPI(DPI);
            nuevaPersona.setNombrePersona(Nombre);
            nuevaPersonaDao.edit(nuevaPersona);
            try {
                Thread.sleep(2000);
                acceso=listar;
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(action.equalsIgnoreCase("eliminar") && l.getRols().equalsIgnoreCase("1")){
            request.setAttribute("eliminars", "enable");
            codigoPersona = Integer.parseInt(request.getParameter("codigoPersona"));
            nuevaPersona.setCodigoPersona(codigoPersona);
            nuevaPersonaDao.eliminar(codigoPersona);
            try {
                Thread.sleep(2000);
                acceso=listar;
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            acceso = index;
        }
      
      RequestDispatcher vista = request.getRequestDispatcher(acceso);
      vista.forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String acceso = "";
                String action = request.getParameter("accion");
                
        if ( action.equalsIgnoreCase("inicio") ) {
            login log = new login();
            String usuario  = request.getParameter("txtUser");
            String password = request.getParameter("txtPassword");
            String rol      = request.getParameter("rol");
            
            if( log.auth(usuario, password, Integer.parseInt(rol)) ) {
                l.setRols(rol);
                acceso = home;
            } else {
                
            }
        }
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);   
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
