package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listarView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"icon\" href=\"../dist/img/LOGO CPF.png?v=2\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no\">\r\n");
      out.write("        <!--CSS-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../dist/css/dataTables/bootstrap-tables.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/bootstrap/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../dist/css/dataTables/dataTables.bootstrap4.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/fontawesome/css/all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/main.css\">\r\n");
      out.write("        <!--Termina CSS-->\r\n");
      out.write("        <title>Listar</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--Empieza Side bar-->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <div id=\"sidebar-wrapper\">\r\n");
      out.write("                <ul class=\"sidebar-nav\">\r\n");
      out.write("                    <li class=\"sidebar-brand\">\r\n");
      out.write("                        <a href=\"#\" class=\"text-center\">\r\n");
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
      out.write("                    <a href=\"#menu-toggle\" class=\"float-left\" id=\"menu-toggle\"><i class=\"fas fa-bars\" style=\"width: 15px; height: 15px;\"></i></a>\r\n");
      out.write("                    <!--**** CONTENIDO AQUI *******-->\r\n");
      out.write("                    <div class=\"pt-5\">\r\n");
      out.write("                        <table id=\"team\" class=\"display table table-striped table-bordered\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Column 1</th>\r\n");
      out.write("                                <th>Column 2</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>Row 1 Data 1</td>\r\n");
      out.write("                                <td>Row 1 Data 2</td>            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--**** CONTENIDO AQUI *******-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--Termina Side bar-->\r\n");
      out.write("    </body>\r\n");
      out.write("    <!--Scripts-->\r\n");
      out.write("    <script src=\"../dist/js/jquery-3.5.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf8\" src=\"../dist/js/dataTables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" charset=\"utf8\" src=\"../dist/js/dataTables/BootstrapDataTables.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(\"#menu-toggle\").click(function (e) {\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            $(\"#wrapper\").toggleClass(\"toggled\");\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready( function () {\r\n");
      out.write("        $('#team').DataTable();\r\n");
      out.write("        } );\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../dist/js/popper.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"../dist/css/fontawesome/js/all.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!--Terminan Scripts-->\r\n");
      out.write("</html>");
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
