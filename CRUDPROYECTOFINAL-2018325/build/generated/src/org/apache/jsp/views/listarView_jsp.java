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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"icon\" href=\"../dist/img/LOGO CPF.png?v=2\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, user-scalable=no\">\n");
      out.write("        <!--CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../dist/css/dataTables/bootstrap-tables.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/bootstrap/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../dist/css/dataTables/dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/fontawesome/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../dist/css/main.css\">\n");
      out.write("        <!--Termina CSS-->\n");
      out.write("        <title>Sidebar</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <!--Empieza Side bar-->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar-wrapper\">\n");
      out.write("            <ul class=\"sidebar-nav\">\n");
      out.write("                <li class=\"sidebar-brand\">\n");
      out.write("                    <a class=\"text-center\" href=\"#\">\n");
      out.write("                    <center>\n");
      out.write("                        <img class=\"img-responsive img-circle logo-img\" src=\"../dist/img/LOGO%20CPF.png\">\n");
      out.write("                    </center></a>\n");
      out.write("                </li>\n");
      out.write("                <li style=\"list-style: none; display: inline\">\n");
      out.write("                    <div class=\"links\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"../index.html\">Inicio</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"listarView.jsp\">Listar</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"addView.jsp\">Agregar</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div><!-- Page Content -->\n");
      out.write("        <div id=\"page-content-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"float-left\" href=\"#menu-toggle\" id=\"menu-toggle\"><i class=\"fas fa-bars\" style=\"width: 15px; height: 15px;\"></i></a> <!--**** CONTENIDO AQUI *******-->\n");
      out.write("                <div class=\"pt-5\">\n");
      out.write("                    <table class=\"display table table-striped table-bordered\" id=\"team\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Column 1</th>\n");
      out.write("                                <th>Column 2</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Row 1 Data 1</td>\n");
      out.write("                                <td>Row 1 Data 2</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div><!--**** CONTENIDO AQUI *******-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--Termina Side bar-->\n");
      out.write("    <!--Scripts-->\n");
      out.write("    <script src=\"../dist/js/jquery-3.5.1.min.js\" type=\"text/javascript\">\n");
      out.write("    </script> \n");
      out.write("    <script charset=\"utf8\" src=\"../dist/js/dataTables/jquery.dataTables.min.js\" type=\"text/javascript\">\n");
      out.write("    </script> \n");
      out.write("    <script charset=\"utf8\" src=\"../dist/js/dataTables/BootstrapDataTables.min.js\" type=\"text/javascript\">\n");
      out.write("    </script> \n");
      out.write("    <script>\n");
      out.write("        $(\"#menu-toggle\").click(function (e) {\n");
      out.write("            e.preventDefault();\n");
      out.write("            $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("        });\n");
      out.write("    </script> \n");
      out.write("    <script>\n");
      out.write("        $(document).ready( function () {\n");
      out.write("        $('#team').DataTable();\n");
      out.write("        } );\n");
      out.write("    </script> \n");
      out.write("    <script src=\"../dist/js/popper.min.js\" type=\"text/javascript\">\n");
      out.write("    </script> \n");
      out.write("    <script src=\"../dist/css/fontawesome/js/all.min.js\" type=\"text/javascript\">\n");
      out.write("    </script> <!--Terminan Scripts-->\n");
      out.write("</body>\n");
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
