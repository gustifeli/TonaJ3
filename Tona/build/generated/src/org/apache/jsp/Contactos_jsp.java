package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contactos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" http-equiv=\"Content-type\" content=\"text/html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylecontacto.css\">\r\n");
      out.write("<!--        <link type=\"text/css\" href=\"Content/bootstrap.css\" rel=\"stylesheet\">-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\r\n");
      out.write("        <title>Contacto</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"Image/prueba.jpg\">\r\n");
      out.write("        <!--        <script type=\"text/javascript\">\r\n");
      out.write("                    window.onload = function () {\r\n");
      out.write("                        alert(\"El mensaje se envio con exito\");\r\n");
      out.write("                    };\r\n");
      out.write("                </script>-->\r\n");
      out.write("        <nav id='nav' class=\"navbar navbar-dark\">\r\n");
      out.write("            <a href=\"Tona.jsp\" id=\"TONA\" class=\"navbar-brand\">TONA</a>\r\n");
      out.write("            <a href=\"Login.jsp\" class=\"navbar-brand\"><img id=\"img\" src=\"Image/maniqui.png\"></a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <div class=\" navbar justify-content-end\">\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item active\">\r\n");
      out.write("                            <a class=\"aTxtColor\" href=\"Galeria.jsp\">Galeria</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"aTxtColor\" href=\"Contactos.jsp\">Contacto</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <h1 id=\"contacto\">Contacto</h1>\r\n");
      out.write("        <div class=\"form-row justify-content-center\">\r\n");
      out.write("            <div id=\"tabla1\" class=\"col\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>* Nombre:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control-md\" id=\"nombre\" name=\"nombre\" autofocus=\"nombre\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>* Apellido:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control-md\" id=\"apellido\" name=\"apellido\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>* E-mail:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control-md\" id=\"email\" name=\"email\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>* Teléfono:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control-md\" id=\"telefono\" name=\"telefono\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>* Localidad:</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control-md\" id=\"localidad\" name=\"localidad\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <p>* Datos obligatorios</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"tabla2\" class=\"col\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label>* Mensaje:</label>\r\n");
      out.write("                    <textarea class=\"form-control\" id=\"comentario\" name=\"comentario\" row=\"7\" cols=\"40\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"clear\" class=\"justify-content-center\">\r\n");
      out.write("                    <input name=\"sumbit\" type=\"submit\" onclick=\"send()\" class=\"button boton\" id=\"sumbit_contacto\" value=\"ENVIAR\" />\r\n");
      out.write("                    <p class=\"ocultar\">\r\n");
      out.write("                        Para comunicarte,completá el formulario, o envianos un mail a la siguiente dirección:\r\n");
      out.write("                        <a href=\"mailto:tonaoficial@hotmail.com\" class=\"linea\">tonaoficial@hotmail.com</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <nav id=\"nav\" class=\" navbar-inverse fixed-bottom\">\r\n");
      out.write("                        <div id=\"txtfooter\">\r\n");
      out.write("                            <p class=\"text-center credit txtbtn\"> - TONA - Santa Eufemia, Cordoba, Argentina</p>\r\n");
      out.write("                            <div class=\"text-center img\">\r\n");
      out.write("                                <a href=\"https://www.instagram.com/t.o.n.aa/?hl=es\"> <img src=\"Image/Instagram.png\"></a>\r\n");
      out.write("                                <a href=\"https://www.facebook.com/TONAAOFICIAL/?pnref=story\"> <img src=\"Image/facebook.png\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
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
