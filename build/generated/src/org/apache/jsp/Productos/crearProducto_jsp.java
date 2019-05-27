package org.apache.jsp.Productos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Crear Producto</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Gloria+Hallelujah|Lobster&display=swap\" rel=\"stylesheet\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function cambiar(){\n");
      out.write("                var pdrs = document.getElementById('file-upload').files[0].name;\n");
      out.write("                document.getElementById('info').innerHTML = pdrs;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/base.css\"> \n");
      out.write("        <style type=\"text/css\"> </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <h1 class=\"title\">Producto</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    ");
 
                        String imagen = "../img/prueba.png";
                    
      out.write("           \n");
      out.write("                    <img alt=\"\" src=\"../img/prueba.png\">\n");
      out.write("                    <label for=\"file-upload\" class=\"subir\">\n");
      out.write("                        <i class=\"fas fa-cloud-upload-alt\"></i> Archivo\n");
      out.write("                    </label>\n");
      out.write("                    <div id=\"info\" style=\"color: white\"></div>\n");
      out.write("                    <input id=\"file-upload\" onchange='cambiar()' type=\"file\" style='display: none;'/>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Proveedor</span>\n");
      out.write("                    <select name=\"proveedor\" class=\"elemento\">\n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                </div> \n");
      out.write("                 <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Cantidad</span>\n");
      out.write("                    <input name=\"cantidad\" class=\"elemento\" type=\"number\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Garantia</span>\n");
      out.write("                    <input name=\"garantia\" class=\"elemento\" type=\"number\" placeholder=\"\">\n");
      out.write("                </div>                    \n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2vh\">\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Nombre &nbsp&nbsp&nbsp</span>\n");
      out.write("                    <input name=\"cantidad\" class=\"elemento\" type=\"text\" placeholder=\"\">\n");
      out.write("                </div> \n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Precio Compra</span>\n");
      out.write("                    <input name=\"cantidad\" class=\"elemento\" type=\"number\" placeholder=\"\">\n");
      out.write("                </div> \n");
      out.write("                 <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Precio Venta</span>\n");
      out.write("                    <input name=\"cantidad\" class=\"elemento\" type=\"number\" placeholder=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("                    <span class=\"text\">Categoria</span>\n");
      out.write("                    <select name=\"proveedor\" class=\"elemento\">\n");
      out.write("                        \n");
      out.write("                    </select>\n");
      out.write("                </div>                     \n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("            <div class=\"row\" style=\"margin-top: 2vh;\">\n");
      out.write("                <span class=\"text col-3\">Descripcion</span>\n");
      out.write("                <textarea class=\"area col-5\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
}
