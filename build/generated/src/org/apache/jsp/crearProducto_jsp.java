package org.apache.jsp;

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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            .banner{\n");
      out.write("                height: 35vh;\n");
      out.write("                width: 100%;\n");
      out.write("                background-image: url('./banner.png');\n");
      out.write("                background-size: contain;\n");
      out.write("                background-repeat: no-repeat;   \n");
      out.write("                position: relative;\n");
      out.write("                background-color: #000;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                color: white; \n");
      out.write("                position: absolute;\n");
      out.write("                top: 55%;\n");
      out.write("                left: 10%;\n");
      out.write("                font-size: 10vh;\n");
      out.write("                text-shadow: 3px 2px #000;\n");
      out.write("                font-family: 'Gloria Hallelujah', cursive;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                position: relative;\n");
      out.write("                height: 40vh;     \n");
      out.write("                background-color: #2C2C2C;\n");
      out.write("                margin-top: 10vh;\n");
      out.write("                width: 80vw;\n");
      out.write("                margin-left: 10%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 5vh;\n");
      out.write("            }\n");
      out.write("            .elemento{               \n");
      out.write("                background-color: #A2A2A245;\n");
      out.write("                border: transparent;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                width: 11vw;\n");
      out.write("                height: 3.5vh;\n");
      out.write("            }\n");
      out.write("            .area{\n");
      out.write("                background-color: #A2A2A245;\n");
      out.write("                border: transparent;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                width: 39vh;\n");
      out.write("                height: 10vh;\n");
      out.write("                margin-left: 2vh;\n");
      out.write("            }\n");
      out.write("            .text{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 3vh;\n");
      out.write("            }\n");
      out.write("            select{\n");
      out.write("                width: 11vw;\n");
      out.write("                height: 3.5vh;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                height: 10vh;\n");
      out.write("                width: 15vh;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .subir{\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                background: #000;\n");
      out.write("                color:#fff;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .subir:hover{\n");
      out.write("                color:#fff;\n");
      out.write("                background: #A1A1A1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
 
                        String imagen = "prueba.png";
                    
      out.write("           \n");
      out.write("                    <img alt=\"\" src=\"prueba.png\">\n");
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
