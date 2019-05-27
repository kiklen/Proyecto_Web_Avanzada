package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificarusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Modificar Usuario</title>\n");
      out.write("        <style>\n");
      out.write("            .aceptar{\n");
      out.write("                background-color: transparent; border: solid; border-color: cornflowerblue; height: 4vh;  border-radius: 3px; \n");
      out.write("            }\n");
      out.write("            .aceptar:hover{\n");
      out.write("                background-color: cornflowerblue; border: transparent; border-color: white; height: 4vh;  border-radius: 3px; color: white; cursor: pointer\n");
      out.write("            }\n");
      out.write("            .cancelar{\n");
      out.write("                background-color: transparent; border: solid; border-color: #ff6666; height: 4vh; border-radius: 3px; margin-left: 2vh\n");
      out.write("            }\n");
      out.write("            .cancelar:hover{\n");
      out.write("                background-color: #ff6666; border: transparent; border-color: white; height: 4vh; border-radius: 3px; color: white; cursor: pointer\n");
      out.write("            }\n");
      out.write("            .regresar{\n");
      out.write("                background-color: transparent; border: solid; border-color: #00cc99; height: 4vh;  border-radius: 3px; margin-left: 2vh\n");
      out.write("            }\n");
      out.write("            .regresar:hover{\n");
      out.write("                background-color: #00cc99; border: transparent; border-color: white; height: 4vh;  border-radius: 3px; color: white; cursor: pointer\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"width: 100%; height: 15%; background-color: cornflowerblue\">\n");
      out.write("            <center>\n");
      out.write("                <h1 style=\"color: white; text-shadow: 2px 2px 2px #000;\">Modificar Usuario</h1>\n");
      out.write("            </center>            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; top: 15%;left: 35%;\">\n");
      out.write("            <img src=\"usuario.jpg\" alt=\"\" style=\"margin-left: 7vw\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"position: absolute; top: 45%;left: 35%; box-shadow: 0px 0px 4px 2px #A1A1A1; height: 20%; width: 25%; padding: 3vh; border-radius: 5px\">\n");
      out.write("            <form action=\"\" method=\"post\">\n");
      out.write("                Usuario: <input type=\"text\" name=\"usuario\" style=\"margin-bottom: 1vh;border-radius: 5px; margin-left: 1.3vh\"> <br>\n");
      out.write("                Password: <input type=\"text\" name=\"pass\" style=\"margin-bottom: 1vh;border-radius: 5px\"> <br>\n");
      out.write("                Nombre: <input type=\"text\" name=\"nombre\" style=\"margin-bottom: 5vh;border-radius: 5px; margin-left: 1.3vh\"> <br>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"submit\" value=\"Aceptar\" class=\"aceptar\">\n");
      out.write("                    <button class=\"cancelar\">\n");
      out.write("                        Cancelar\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"regresar\">\n");
      out.write("                        Regresar\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
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
