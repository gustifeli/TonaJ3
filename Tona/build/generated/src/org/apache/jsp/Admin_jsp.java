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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionUser']==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
response.sendRedirect("Login.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" http-equiv=\"Content-type\" content=\"text/html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/stylegeneral.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Content/styleAddProducto.css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"Image/imgsolapa.png\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"Image/imgsolapa.png\" type=\"image/png\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <title>All Products</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"background-admin\" style=\"background-attachment: fixed\">\n");
      out.write("        <nav id='nav' class=\"navbar navbar-dark fixed-top\">\n");
      out.write("\n");
      out.write("            <a href=\"Tona.jsp\" id=\"TONA\" class=\"navbar-brand\">TONA</a>\n");
      out.write("            <a href=\"Login.jsp\" class=\"navbar-brand\"><img id=\"img\" src=\"Image/maniqui1.png\"></a>\n");
      out.write("\n");
      out.write("            <div class=\"input-group-sm\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope['sessionUser']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"true\" aria-label=\"Username\" aria-describedby=\"basic-addon1\">\n");
      out.write("                <i id=\"user\" class=\"material-icons sm-dark sm-inactive\">account_circle</i>\n");
      out.write("                <form action=\"Logout\" method=\"post\">\n");
      out.write("                    <button id=\"botp\" class=\"btn btn-danger btn-circle\"  type=\"submit\"><i id=\"power\" class=\"material-icons sm-dark sm-inactive\">power_settings_new</i></button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!--            <form action=\"Logout\" method=\"post\">\n");
      out.write("                            <button id=\"btn-circle\" class=\"btn btn-default\"  type=\"submit\"><i id=\"power\" class=\"material-icons sm-dark sm-inactive\">power_settings_new</i></button>\n");
      out.write("                        </form>-->\n");
      out.write("            <i id=\"menus\" class=\"material-icons justify-content-end\" style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">\n");
      out.write("                more_vert\n");
      out.write("            </i>\n");
      out.write("            <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("                <a id=\"txtmenu\" href=\"Galeria.jsp\">GALERIA</a>\n");
      out.write("                <a id=\"txtmenu\" href=\"Contactos.jsp\">CONTACTO</a>\n");
      out.write("            </div>\n");
      out.write("            <!--            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                            <div class=\" navbar justify-content-end\">\n");
      out.write("                                <ul class=\"navbar-nav\">\n");
      out.write("                                    <li class=\"nav-item active\">\n");
      out.write("                                        <a class=\"aTxtColor\" href=\"Galeria.jsp\">Galeria</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"nav-item\">\n");
      out.write("                                        <a class=\"aTxtColor\" href=\"Contactos.jsp\">Contacto</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>-->\n");
      out.write("        </nav>\n");
      out.write("        <h1 id=\"encabezadoAdmin\">Productos</h1>      \n");
      out.write("        <div class=\"container-fluid\">         \n");
      out.write("            <div class=\"panel-group table-wrapper-scroll-y\">\n");
      out.write("                <!--                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modalPortada\">\n");
      out.write("                                    Nueva Portada\n");
      out.write("                                </button>-->\n");
      out.write("                <button class=\" btn btn-outline-secondary\" onclick=\"location.href = 'obtenerPortada'\" type=\"button\" style=\"float: right; display: inline-block !Important; margin-bottom: 3px; height: 40px; margin-left: 5px;\"> + Portada</button>\n");
      out.write("                <button onclick=\"location.href = 'obtenerCampana'\" type=\"button\" class=\"btn btn-outline-primary\" style=\"float: right;  display: inline-block !Important; margin-bottom: 3px; height: 40px; border-radius: 5px;\"><i class=\"material-icons\">add_circle_outline</i></button>\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead class=\"thead-dark\" >\n");
      out.write("                            <tr>\n");
      out.write("                                <th hidden=\"true\" scope=\"col\">Cod.</th>\n");
      out.write("                                <th class=\"rowWidth\" scope=\"col\">Imagen</th>\n");
      out.write("                                <th style=\"width: 60%\" scope=\"col\">Descripción</th>\n");
      out.write("                                <th hidden=\"true\" scope=\"col\">CodCamp</th>\n");
      out.write("                                <th scope=\"col\">Campaña</th>\n");
      out.write("                                <th class=\"rowWidth\" scope=\"col\"></th>\n");
      out.write("                                <th class=\"rowWidth\" scope=\"col\"></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div>\n");
      out.write("                    <nav id=\"nav\" class=\" navbar-inverse\">\n");
      out.write("                        <div id=\"txtfooter\">\n");
      out.write("                            <p class=\"text-center credit txtbtn\">- TONA - Santa Eufemia, Cordoba, Argentina</p>\n");
      out.write("                            <div class=\"text-center img\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <!--modal-->\n");
      out.write("        <div class=\"modal fade\"  id=\"modalPortada\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Nueva Imagen Portada</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form method=\"post\" action=\"agragarImagenPortada\" enctype=\"multipart/form-data\" onsubmit=\"return nvaPort()\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-9\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text input-span\">Imagen</span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <span class=\"logo\" style=\"width: 0px\">\n");
      out.write("                                                <input class=\"file-input logo\" id=\"logo\" type=\"file\" name=\"imgPort\" accept=\"image/*\" onchange=\"loadFile(event)\">\n");
      out.write("                                            </span>\n");
      out.write("                                            <label for=\"logo\" class=\"btn btn-outline-dark\">\n");
      out.write("                                                <span>Seleccionar el archivo</span>\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                <p><img class=\"img-thumbnail shadow-lg centrar\" id=\"previewImg\" src=\"Image/nodisponible.png\" alt=\"ImgPreview\"></p>\n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function alerta(id) {\n");
      out.write("                var p = confirm(\"Â¿Esta seguro que desea eliminar el producto?\");\n");
      out.write("                if (p == true) {\n");
      out.write("                    location.href = \"EliminarProducto?cod=\" + id;\n");
      out.write("                    alert(\"Â¡El producto se elimino con Ã©xito!\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function modifAlert(id) {\n");
      out.write("                var p = confirm(\"Â¿Esta seguro que desea modificar el producto?\");\n");
      out.write("                if (p == true) {\n");
      out.write("                    location.href = \"BuscarProductoCod?cod=\" + id;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!--funcion para cargar la preview-->\n");
      out.write("        <script>\n");
      out.write("            var loadFile = function (event) {\n");
      out.write("                var output = document.getElementById('previewImg');\n");
      out.write("                output.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function openNav() {\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"150px\";\n");
      out.write("            }\n");
      out.write("            function closeNav() {\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("                document.getElementById(\"main\").style.marginRight = \"0\";\n");
      out.write("                document.body.style.backgroundColor = \"white\";\n");
      out.write("            }\n");
      out.write("        </script>        \n");
      out.write("        <script src=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.js\"></script>\n");
      out.write("    </body>\n");
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
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td hidden=\"true\">");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td><img style=\"width: 70px\" src=\"ObtenerImagen?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"imagenProducto\"></td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td hidden=\"true\">");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <!--<td><form action=\"BuscarProductoCod?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\"><button role=\"button\" class=\"btn btn-outline-primary\" type=\"submit\">Editar</button></form></td>-->\n");
          out.write("                                    <!--<td><form action=\"EliminarProducto?cod=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\"><button role=\"button\" id=\"btnEliminar\" class=\"btn btn-outline-danger\" type=\"submit\">Eliminar</button></form></td>-->\n");
          out.write("\n");
          out.write("                                    <!--START TEST-->\n");
          out.write("                                    <td><button id=\"btnModif\" class=\"btn btn-outline-primary\" onclick=\"modifAlert(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"material-icons\">edit</i></button></td>\n");
          out.write("                                    <td><button id=\"btnEliminar\" class=\"btn btn-outline-danger\" onclick=\"alerta(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.idproducto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"material-icons\">delete_sweep</i></button></td>\n");
          out.write("                                    <!--END TEST-->\n");
          out.write("                                </tr>\n");
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
