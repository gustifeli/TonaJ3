package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.web.context.request.SessionScope;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionUser']==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    ");
response.sendRedirect("Login.jsp");
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" http-equiv=\"Content-type\" content=\"text/html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/styleAddProducto.css\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <title>All Products</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"background-admin\" style=\"background-attachment: fixed\">\r\n");
      out.write("        <nav id='nav' class=\"navbar navbar-dark fixed-top\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"Tona.jsp\" id=\"TONA\" class=\"navbar-brand\">TONA</a>\r\n");
      out.write("            <a href=\"Login.jsp\" class=\"navbar-brand\"><img id=\"img\" src=\"Image/maniqui1.png\"></a>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"input-group-sm\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionUser']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"true\" aria-label=\"Username\" aria-describedby=\"basic-addon1\">\r\n");
      out.write("                <i id=\"user\" class=\"material-icons sm-dark sm-inactive\">account_circle</i>\r\n");
      out.write("                <form action=\"Logout\" method=\"post\">\r\n");
      out.write("                    <button id=\"botp\" class=\"btn btn-danger btn-circle\"  type=\"submit\"><i id=\"power\" class=\"material-icons sm-dark sm-inactive\">power_settings_new</i></button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"Logout\" method=\"post\">\r\n");
      out.write("                <button id=\"btn-circle\" class=\"btn btn-default\"  type=\"submit\"><i id=\"power\" class=\"material-icons sm-dark sm-inactive\">power_settings_new</i></button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <i class=\"material-icons justify-content-end\" style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">\r\n");
      out.write("                more_vert\r\n");
      out.write("            </i>\r\n");
      out.write("            <div id=\"mySidenav\" class=\"sidenav\">\r\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("                <a id=\"txtmenu\" href=\"Galeria.jsp\">GALERIA</a>\r\n");
      out.write("                <a id=\"txtmenu\" href=\"Contactos.jsp\">CONTACTO</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                            <div class=\" navbar justify-content-end\">\r\n");
      out.write("                                <ul class=\"navbar-nav\">\r\n");
      out.write("                                    <li class=\"nav-item active\">\r\n");
      out.write("                                        <a class=\"aTxtColor\" href=\"Galeria.jsp\">Galeria</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"aTxtColor\" href=\"Contactos.jsp\">Contacto</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>-->\r\n");
      out.write("        </nav>\r\n");
      out.write("        <h1 id=\"encabezadoAdmin\">Productos</h1>      \r\n");
      out.write("        <div class=\"container-fluid\">         \r\n");
      out.write("            <div class=\"panel-group table-wrapper-scroll-y\">\r\n");
      out.write("                <!--                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modalPortada\">\r\n");
      out.write("                                    Nueva Portada\r\n");
      out.write("                                </button>-->\r\n");
      out.write("                <button class=\" btn btn-outline-secondary\" onclick=\"location.href = 'obtenerPortada'\" type=\"button\"> + Portada</button>\r\n");
      out.write("                <button onclick=\"location.href = 'obtenerCampana'\" type=\"button\" class=\"btn btn-outline-primary\" style=\"float: right;  display: inline-block !Important; margin-bottom: 3px; height: 40px; border-radius: 5px;\"><i class=\"material-icons\">add_circle_outline</i></button>\r\n");
      out.write("                <div class=\"table-responsive\">\r\n");
      out.write("                    <table class=\"table\">\r\n");
      out.write("                        <thead class=\"thead-dark\" >\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th hidden=\"true\" scope=\"col\">Cod.</th>\r\n");
      out.write("                                <th class=\"rowWidth\" scope=\"col\">Imagen</th>\r\n");
      out.write("                                <th style=\"width: 60%\" scope=\"col\">Descripción</th>\r\n");
      out.write("                                <th hidden=\"true\" scope=\"col\">CodCamp</th>\r\n");
      out.write("                                <th scope=\"col\">Campaña</th>\r\n");
      out.write("                                <th class=\"rowWidth\" scope=\"col\"></th>\r\n");
      out.write("                                <th class=\"rowWidth\" scope=\"col\"></th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <nav id=\"nav\" class=\" navbar-inverse\">\r\n");
      out.write("                        <div id=\"txtfooter\">\r\n");
      out.write("                            <p class=\"text-center credit txtbtn\">- TONA - Santa Eufemia, Cordoba, Argentina</p>\r\n");
      out.write("                            <div class=\"text-center img\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--modal-->\r\n");
      out.write("        <div class=\"modal fade\"  id=\"modalPortada\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Nueva Imagen Portada</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form method=\"post\" action=\"agragarImagenPortada\" enctype=\"multipart/form-data\" onsubmit=\"return nvaPort()\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-lg-9\">\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <div class=\"input-group-prepend\">\r\n");
      out.write("                                                <span class=\"input-group-text input-span\">Imagen</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <span class=\"logo\" style=\"width: 0px\">\r\n");
      out.write("                                                <input class=\"file-input logo\" id=\"logo\" type=\"file\" name=\"imgPort\" accept=\"image/*\" onchange=\"loadFile(event)\">\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <label for=\"logo\" class=\"btn btn-outline-dark\">\r\n");
      out.write("                                                <span>Seleccionar el archivo</span>\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-3\">\r\n");
      out.write("                                <p><img class=\"img-thumbnail shadow-lg centrar\" id=\"previewImg\" src=\"Image/nodisponible.png\" alt=\"ImgPreview\"></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            function alerta(id) {\r\n");
      out.write("                var p = confirm(\"¿Esta seguro que desea eliminar el producto?\");\r\n");
      out.write("                if (p == true) {\r\n");
      out.write("                    location.href = \"EliminarProducto?cod=\" + id;\r\n");
      out.write("                    alert(\"¡El producto se elimino con éxito!\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function modifAlert(id) {\r\n");
      out.write("                var p = confirm(\"¿Esta seguro que desea modificar el producto?\");\r\n");
      out.write("                if (p == true) {\r\n");
      out.write("                    location.href = \"BuscarProductoCod?cod=\" + id;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <!--funcion para cargar la preview-->\r\n");
      out.write("        <script>\r\n");
      out.write("            var loadFile = function (event) {\r\n");
      out.write("                var output = document.getElementById('previewImg');\r\n");
      out.write("                output.src = URL.createObjectURL(event.target.files[0]);\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function openNav() {\r\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"150px\";\r\n");
      out.write("            }\r\n");
      out.write("            function closeNav() {\r\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("                document.getElementById(\"main\").style.marginRight = \"0\";\r\n");
      out.write("                document.body.style.backgroundColor = \"white\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js\"></script>\r\n");
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
          out.write("                                <tr>\r\n");
          out.write("                                    <td hidden=\"true\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td><img style=\"width: 70px\" src=\"ObtenerImagen?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"imagenProducto\"></td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td hidden=\"true\">");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("                                    <!--<td><form action=\"BuscarProductoCod?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\"><button role=\"button\" class=\"btn btn-outline-primary\" type=\"submit\">Editar</button></form></td>-->\r\n");
          out.write("                                    <!--<td><form action=\"EliminarProducto?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\"><button role=\"button\" id=\"btnEliminar\" class=\"btn btn-outline-danger\" type=\"submit\">Eliminar</button></form></td>-->\r\n");
          out.write("\r\n");
          out.write("                                    <!--START TEST-->\r\n");
          out.write("                                    <td><button id=\"btnModif\" class=\"btn btn-outline-primary\" onclick=\"modifAlert(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"material-icons\">edit</i></button></td>\r\n");
          out.write("                                    <td><button id=\"btnEliminar\" class=\"btn btn-outline-danger\" onclick=\"alerta(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"material-icons\">delete_sweep</i></button></td>\r\n");
          out.write("                                    <!--END TEST-->\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
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
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.descripcion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idCampana}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.campana}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
