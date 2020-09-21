package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/bootstrap/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/main.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/fontawesome/css/all.min.css\">\r\n");
      out.write("        <link rel=\"icon\" href=\"../dist/img/LOGO CPF.png?v=2\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no\">\r\n");
      out.write("        <title>Agregar</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"color-section\">\r\n");
      out.write("        <!--Empieza side bar-->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("            <div id=\"sidebar-wrapper\">\r\n");
      out.write("                <ul class=\"sidebar-nav\">\r\n");
      out.write("                    <li class=\"sidebar-brand\">\r\n");
      out.write("                        <a hre=\"#\" class=\"text-center\">\r\n");
      out.write("                            <center><img src=\"../dist/img/LOGO CPF.png\" class=\"img-responsive img-circle logo-img\"></center>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <div class=\"links\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"../index.html\">Inicio</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"listarView.jsp\">Listar</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"addView.jsp\">Agregar</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Page Content -->\r\n");
      out.write("            <div id=\"page-content-wrapper\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <a href=\"#menu-toggle\" class=\"float-right\" id=\"menu-toggle\"><i class=\"fas fa-bars\" style=\"whidth: 15px; height: 15px;\"></i></a>\r\n");
      out.write("                    <!--**** CONTENIDO AQUI *******-->\r\n");
      out.write("                    <div class=\"container form-center\">\r\n");
      out.write("                        <div class=\"col-lg-4\">\r\n");
      out.write("                            <h1>Agregar Persona</h1>\r\n");
      out.write("                            <form action=\"Controlador\">\r\n");
      out.write("                                <strong>DPI:</strong><br>\r\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"txtDPI\"><br>\r\n");
      out.write("                                <strong>Nombres:</strong><br>\r\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"txtNombres\"><br><br>\r\n");
      out.write("                                <div class=\"text-center\"><input class=\"btn btn-success btn-lg\" type=\"submit\" name=\"accion\" value=\"Agregar\"></div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--**** CONTENIDO AQUI *******-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        <!--Termina Side bar -->\r\n");
      out.write("    </body>\r\n");
      out.write("    <!--Scripts-->\r\n");
      out.write("    <script src=\"../dist/js/jquery-3.5.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(\"#menu-toggle\").click(function(e){\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $(\"#wrapper\").toggleClass(\"toggled\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"../dist/js/popper.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"../dist/css/fontawesome/js/all.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <!--Termina Scripts-->\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
