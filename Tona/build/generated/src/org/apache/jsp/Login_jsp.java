package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_if_test.release();
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
      out.write('\r');
      out.write('\n');
      //  t:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_t_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_t_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_t_if_0.setPageContext(_jspx_page_context);
      _jspx_th_t_if_0.setParent(null);
      _jspx_th_t_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionUser']!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_t_if_0 = _jspx_th_t_if_0.doStartTag();
      if (_jspx_eval_t_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
 response.sendRedirect("ListaProducto");
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_t_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
        return;
      }
      _jspx_tagPool_t_if_test.reuse(_jspx_th_t_if_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link type=\"text/css\" href=\"Content/styleLogReg.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <!--    <body>\r\n");
      out.write("            <div id=\"table\">\r\n");
      out.write("                <div id=\"\">\r\n");
      out.write("                    <div id=\"\">\r\n");
      out.write("                        <img src=\"Image/TONAlogin.png\" >\r\n");
      out.write("                        <p style=\"color: #c9302c\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['error']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                        <form action=\"LogIn\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Usuario </label>\r\n");
      out.write("                                <div class=\"col-lg-12\">\r\n");
      out.write("                                    <input type=\"text\"  name=\"name\" placeholder=\"Ingrese su usuario\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label>Contraseña </label>\r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <input type=\"text\" name=\"pass\" placeholder=\"Ingrese su Contraseña\" class=\"form-control\"\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div class=\"col-md-offset-1 col-md-10 text-center\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"Iniciar sesión\" class=\"btn btn-danger\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        </body>-->\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"background-transparent\"></div>\r\n");
      out.write("    <center><div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <img src=\"Image/TONAlogin.png\" >\r\n");
      out.write("                <p style=\"color: #c9302c\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['error']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <form action=\"IniciarSesion\" method=\"post\">\r\n");
      out.write("                    <div class=\"input-group mb-3\">\r\n");
      out.write("                        <div class=\"input-group-prepend\">\r\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\">Usuario</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"text\" name=\"name\" class=\"form-control\"  aria-label=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"input-group mb-3\">\r\n");
      out.write("                        <div class=\"input-group-prepend\">\r\n");
      out.write("                            <span class=\"input-group-text\" id=\"basic-addon1\">Contraseña</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"password\" name=\"pass\" class=\"form-control\"  aria-label=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <p style=\"color: #c9302c\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msj}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\" >\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-outline\" value=\"Acceder\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div></center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
