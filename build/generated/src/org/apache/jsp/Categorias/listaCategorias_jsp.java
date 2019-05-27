package org.apache.jsp.Categorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import basedatos.beans.Producto;

public final class listaCategorias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Listar Categorias</title>\n");
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
      out.write("            <h1 class=\"title\">Categoria</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"head\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <span class=\"col text\">Nombre</span>\n");
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
