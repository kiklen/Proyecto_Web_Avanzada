package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import basedatos.beans.Producto;

public final class listaProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("            .head{\n");
      out.write("                position: relative;\n");
      out.write("                height: 10vh;     \n");
      out.write("                background-color: #2C2C2C;\n");
      out.write("                margin-top: 10vh;\n");
      out.write("                width: 74vw;\n");
      out.write("                margin-left: 10%;\n");
      out.write("                border-top-left-radius: 10px;\n");
      out.write("                border-top-right-radius: 10px;\n");
      out.write("                padding: 5vh;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px !important;\n");
      out.write("            }\n");
      out.write("            .container{\n");
      out.write("                position: relative;\n");
      out.write("                height: 40vh;     \n");
      out.write("                background-color: #2C2C2C;                \n");
      out.write("                width: 74vw !important;\n");
      out.write("                margin-left: 10%;\n");
      out.write("                border-bottom-left-radius: 10px;\n");
      out.write("                border-bottom-right-radius: 10px;\n");
      out.write("                padding: 5vh;\n");
      out.write("                overflow-y: auto;\n");
      out.write("            }\n");
      out.write("            .elemento{               \n");
      out.write("                background-color: #A2A2A245;\n");
      out.write("                border: transparent;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                width: 11vw;\n");
      out.write("                height: 3.5vh;\n");
      out.write("            }\n");
      out.write("            .text{\n");
      out.write("                color: white;\n");
      out.write("                font-size: 3vh;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .agregar{\n");
      out.write("                border-radius: 30px;\n");
      out.write("                width: 3vh;\n");
      out.write("                height: 3vh;\n");
      out.write("                border: transparent;\n");
      out.write("                background-color: transparent;\n");
      out.write("            }\n");
      out.write("            .add{\n");
      out.write("                height: 5vh;\n");
      out.write("                width: 12vh;\n");
      out.write("                background-color: transparent;\n");
      out.write("                border-color: #8AB4F8;\n");
      out.write("                border: solid;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                color: #8AB4F8; \n");
      out.write("                float: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .add:hover{\n");
      out.write("                height: 5vh;\n");
      out.write("                width: 12vh;\n");
      out.write("                background-color: #8AB4F8;\n");
      out.write("                border-color: transparent;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                color: #000;                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <h1 class=\"title\">Producto</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <span class=\"col text\">Nombre</span>\n");
      out.write("                <span class=\"col text\">Proveedor</span>\n");
      out.write("                <span class=\"col text\">Descripcion</span>\n");
      out.write("                <span class=\"col text\">Categoria</span>\n");
      out.write("                <span class=\"col text\">Cantidad</span>\n");
      out.write("                <span class=\"col text\">Precio Compra</span>\n");
      out.write("                <span class=\"col text\">Precio Venta</span>\n");
      out.write("                <span class=\"col text\">Garantia</span>\n");
      out.write("                <span class=\"col \"> \n");
      out.write("                    <button class=\"add\">\n");
      out.write("                        Agregar\n");
      out.write("                    </button>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container \" style=\"color:white\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

                                
                List <Producto> productos = new ArrayList();
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
                productos.add(new Producto("nomnbre","proveedor","Descripcion","categoria",2,2,2,2));
               // productos.get(0).getNombre();
                for (int idx = 0; idx < productos.size(); idx++) {
                  
            
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getNombre());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getProveedor());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getDescripcion());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getCategoria());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getCantidad());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getCompra());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getVenta());
      out.write("</span>\n");
      out.write("                <span class=\"col text\">");
      out.print( productos.get(idx).getGarantia());
      out.write("</span>\n");
      out.write("                <span class=\"col\">\n");
      out.write("                    <button class=\"agregar\"><img src=\"editar.png\" alt=\"\" style=\"border-radius: 30px; width: 3vh;height: 3vh; \"></button>\n");
      out.write("                    <button class=\"agregar\"><img src=\"eliminar.png\" alt=\"\" style=\"border-radius: 30px; width: 3vh;height: 3vh; \"></button>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("            ");

                    
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
