package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GaleriaInvierno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegalerias.css\">\r\n");
      out.write("<!--        <link type=\"text/css\" href=\"Content/bootstrap.css\" rel=\"stylesheet\">-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\r\n");
      out.write("        <title>Galería</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("        <h1 id=\"encabezado\" class=\"container-fluid\">TEMPORADA OTOÑO-INVIERNO</h1>\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <center><span>Ordenar por:</span>\r\n");
      out.write("                    <select class=\"sort-by\">\r\n");
      out.write("                        <option value=\"price-ascending\">Menor a mayor</option>\r\n");
      out.write("                        <option value=\"price-descending\">Mayor a menor</option>\r\n");
      out.write("                        <option value=\"alpha-ascending\">A-Z</option>\r\n");
      out.write("                        <option value=\"alpha-descenging\">Z-A</option>\r\n");
      out.write("                        <option value=\"created-descending\">Más nuevo al más viejo</option>\r\n");
      out.write("                        <option value=\"created-ascending\">Más viejo al más nuevo</option>\r\n");
      out.write("                    </select></center>\r\n");
      out.write("                <div class=\"col-md-3 col-md-9\">\r\n");
      out.write("                    <h2>Talles</h2>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-dark btn-md\">S</a>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-dark btn-md\">M</a>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-dark btn-md\">L</a>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-dark btn-md\">XL</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"grid-container\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("            <nav id=\"nav\" class=\" navbar-inverse fixed-bottom\">\r\n");
      out.write("        <div id=\"txtfooter\">\r\n");
      out.write("            <p class=\"text-center credit txtbtn\">- TONA - Santa Eufemia, Cordoba, Argentina</p>\r\n");
      out.write("            <div class=\"text-center img\">\r\n");
      out.write("                <a href=\"https://www.instagram.com/t.o.n.aa/?hl=es\"> <img src=\"Image/Instagram.png\"></a>\r\n");
      out.write("                <a href=\"https://www.facebook.com/TONAAOFICIAL/?pnref=story\"> <img src=\"Image/facebook.png\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                            lightbox.option({\r\n");
      out.write("                                'resizeDuration': 200,\r\n");
      out.write("                                'wrapAround': true,\r\n");
      out.write("                                'alwaysShowNavOnTouchDevices': true,\r\n");
      out.write("                                'albumLabel': \"\",\r\n");
      out.write("                                'positionFromTop': 50\r\n");
      out.write("                            })\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"polaroid2\">\r\n");
          out.write("                        <img style=\"width:100%; height: 500px\" src=\"ObtenerImagenGaleriaInvierno?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Imagen Producto\">\r\n");
          out.write("                        <div class=\"container2\">\r\n");
          out.write("                            <p>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</p>                                   \r\n");
          out.write("                        </div>    \r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.descripcion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
