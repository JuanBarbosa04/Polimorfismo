

package servlets;

import clases.*;
import clases.NaveAtAt;
import clases.NaveDestructorEstelar;
import clases.NaveHalconMilenario;
import clases.NaveLanzaderaImperial;
import clases.NaveSupremacy;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "servletOperacion", urlPatterns = {"/servletOperacion"})
public class servletOperacion extends HttpServlet {


    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            double recorrido = Double.parseDouble(request.getParameter("txtCantParsec")); 
    
            int halconCantPersonas = Integer.parseInt(request.getParameter("txtHalconCantPersonas"));
            double halconCantLitros = Double.parseDouble(request.getParameter("txtHalconCantLitros"));
            int halconCantNaves = Integer.parseInt(request.getParameter("txtHalconCantNaves"));
            NaveHalconMilenario halcon = new NaveHalconMilenario(halconCantPersonas, halconCantLitros, halconCantNaves,recorrido);
            
              
            int destructorCantPersonas = Integer.parseInt(request.getParameter("txtDestructorCantPersonas"));
            double destructorCantLitros = Double.parseDouble(request.getParameter("txtDestructorCantLitros"));
            int destructorCantNaves = Integer.parseInt(request.getParameter("txtDestructorCantNaves"));
            NaveDestructorEstelar destructor = new NaveDestructorEstelar(destructorCantPersonas, destructorCantLitros,destructorCantNaves,recorrido);
            
            
            int lanzaderaCantPersonas = Integer.parseInt(request.getParameter("txtLanzaderaCantPersonas"));
            double lanzaderaCantLitros = Double.parseDouble(request.getParameter("txtLanzaderaCantLitros"));
            int lanzaderaCantNaves = Integer.parseInt(request.getParameter("txtLanzaderaCantNaves"));
            NaveLanzaderaImperial lanzadera = new NaveLanzaderaImperial(lanzaderaCantPersonas,lanzaderaCantLitros,lanzaderaCantNaves,recorrido);
            
            
            int supremacyCantPersonas = Integer.parseInt(request.getParameter("txtSupremacyCantPersonas"));
            double supremacyCantLitros = Double.parseDouble(request.getParameter("txtSupremacyCantLitros"));
            int supremacyCantNaves = Integer.parseInt(request.getParameter("txtSupremacyCantNaves"));           
            NaveSupremacy supremacy = new NaveSupremacy(supremacyCantPersonas,supremacyCantLitros,supremacyCantNaves,recorrido);
            
            
            int atAtCantPersonas = Integer.parseInt(request.getParameter("txtAtAtCantPersonas"));
            double atAtCantLitros = Double.parseDouble(request.getParameter("txtAtAtCantLitros"));
            int atAtCantNaves = Integer.parseInt(request.getParameter("txtAtAtCantNaves"));
            NaveAtAt atAt = new NaveAtAt(atAtCantPersonas,atAtCantLitros,atAtCantNaves,recorrido);
            
         
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Informacion naves</title>");
            out.println("<link rel=\"stylesheet\" href=\"stilo.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Nave Halcon Milenario:<br>" + halcon.toString()+ "</h2>");
            out.print("<br>");
            out.println("<h2>Nave Destructor Estelar:<br>"+ destructor.toString()+"</h2>");
            out.print("<br>");
            out.println("<h2>Nave Lanzadera Imperial:<br>"+ lanzadera.toString()+"</h2>");
            out.print("<br>");
            out.println("<h2>Nave Supremacy:<br>"+ supremacy.toString()+"</h2>");
            out.print("<br>");
            out.println("<h2>Nave At-At:"+"<br>"+ atAt.toString()+"</h2>");
            out.println("<h1>Total de consumo de todas las naves "+"<br>"+ Naves.getconsumoT() +"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
