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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/bootstrap/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/fontawesome/css/all.min.css\">\n");
      out.write("        <link rel=\"icon\" href=\"../dist/img/LOGO CPF.png?v=2\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no\">\n");
      out.write("        <title>Agregar</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"color-section\">\n");
      out.write("        <!--Empieza side bar-->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("            <div id=\"sidebar-wrapper\">\n");
      out.write("                <ul class=\"sidebar-nav\">\n");
      out.write("                    <li class=\"sidebar-brand\">\n");
      out.write("                        <a hre=\"#\" class=\"text-center\">\n");
      out.write("                            <center><img src=\"../dist/img/LOGO CPF.png\" class=\"img-responsive img-circle logo-img\"></center>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <div class=\"links\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"../index.html\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"listarView.jsp\">Listar</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"addView.jsp\">Agregar</a>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page Content -->\n");
      out.write("            <div id=\"page-content-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <a href=\"#menu-toggle\" class=\"float-right\" id=\"menu-toggle\"><i class=\"fas fa-bars\" style=\"whidth: 15px; height: 15px;\"></i></a>\n");
      out.write("                    <!--**** CONTENIDO AQUI *******-->\n");
      out.write("                    <div class=\"container form-center\">\n");
      out.write("                        <div class=\"col-lg-4\">\n");
      out.write("                            <h1>Agregar Persona</h1>\n");
      out.write("                            <form action=\"Controlador\">\n");
      out.write("                                <strong>DPI:</strong><br>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"txtDPI\"><br>\n");
      out.write("                                <strong>Nombres:</strong><br>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"txtNombres\"><br><br>\n");
      out.write("                                <div class=\"text-center\"><input class=\"btn btn-success btn-lg\" type=\"submit\" name=\"accion\" value=\"Agregar\"></div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--**** CONTENIDO AQUI *******-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("        <!--Termina Side bar -->\n");
      out.write("    </body>\n");
      out.write("    <!--Scripts-->\n");
      out.write("    <script src=\"../dist/js/jquery-3.5.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script>\n");
      out.write("        $(\"#menu-toggle\").click(function(e){\n");
      out.write("            e.preventDefault();\n");
      out.write("            $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script src=\"../dist/js/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"../dist/css/fontawesome/js/all.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("    <!--Termina Scripts-->\n");
      out.write("</html>\n");
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
