

package servlets;

import clases.Main;
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
    
            
            NaveHalconMilenario halcon = new NaveHalconMilenario();
            int halconCantPersonas;
            int halconCantLitros;
            int halconCantNaves;
            
            halconCantPersonas = Integer.parseInt(request.getParameter("txtHalconCantPersonas"));
            halconCantLitros = Integer.parseInt(request.getParameter("txtHalconCantLitros"));
            halconCantNaves = Integer.parseInt(request.getParameter("txtHalconCantNaves"));
            
            //halcon = new NaveHalconMilenario(halconCantPersonas, halconCantLitros, halconCantNaves);
            halcon.setCantPersonas(halconCantPersonas);
            halcon.setCantNaves(halconCantNaves);
            halcon.setCantLitrosPorParsec(halconCantLitros);
            
            
            
            NaveDestructorEstelar destructor = new NaveDestructorEstelar();
            int destructorCantPersonas;
            int destructorCantLitros;
            int destructorCantNaves;
            
            destructorCantPersonas = Integer.parseInt(request.getParameter("txtDestructorCantPersonas"));
            destructorCantLitros = Integer.parseInt(request.getParameter("txtDestructorCantLitros"));
            destructorCantNaves = Integer.parseInt(request.getParameter("txtDestructorCantNaves"));
            
            destructor.setCantPersonas(destructorCantPersonas);
            destructor.setCantLitrosPorParsec(destructorCantLitros);
            destructor.setCantNaves(destructorCantNaves);
            
            
            NaveLanzaderaImperial lanzadera = new NaveLanzaderaImperial();
            int lanzaderaCantPersonas;
            int lanzaderaCantLitros;
            int lanzaderaCantNaves;
            
            lanzaderaCantPersonas = Integer.parseInt(request.getParameter("txtLanzaderaCantPersonas"));
            lanzaderaCantLitros = Integer.parseInt(request.getParameter("txtLanzaderaCantLitros"));
            lanzaderaCantNaves = Integer.parseInt(request.getParameter("txtLanzaderaCantNaves"));
            
            lanzadera.setCantPersonas(lanzaderaCantPersonas);
            lanzadera.setCantLitrosPorParsec(lanzaderaCantLitros);
            lanzadera.setCantNaves(lanzaderaCantNaves);
            
            
                        
            NaveSupremacy supremacy = new NaveSupremacy();
            int supremacyCantPersonas;
            int supremacyCantLitros;
            int supremacyCantNaves;
            
            supremacyCantPersonas = Integer.parseInt(request.getParameter("txtSupremacyCantPersonas"));
            supremacyCantLitros = Integer.parseInt(request.getParameter("txtSupremacyCantLitros"));
            supremacyCantNaves = Integer.parseInt(request.getParameter("txtSupremacyCantNaves"));
            
            supremacy.setCantPersonas(supremacyCantPersonas);
            supremacy.setCantLitrosPorParsec(supremacyCantLitros);
            supremacy.setCantNaves(supremacyCantNaves);
            
            
            NaveAtAt atAt = new NaveAtAt();
            int atAtCantPersonas;
            int atAtCantLitros;
            int atAtCantNaves;
            
            atAtCantPersonas = Integer.parseInt(request.getParameter("txtAtAtCantPersonas"));
            atAtCantLitros = Integer.parseInt(request.getParameter("txtAtAtCantLitros"));
            atAtCantNaves = Integer.parseInt(request.getParameter("txtAtAtCantNaves"));
            
            atAt.setCantPersonas(atAtCantPersonas);
            atAt.setCantLitrosPorParsec(atAtCantLitros);
            atAt.setCantNaves(atAtCantNaves);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Informacion naves</title>");
            out.println("<link rel=\"stylesheet\" href=\"stilo.css\"/>");                  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nave Halcon Milenario:<br>" + halcon.toString()+ "</h1>");
            out.print("<br>");
            out.println("<h1>Nave Destructor Estelar:<br>"+ destructor.toString()+"</h1>");
            out.print("<br>");
            out.println("<h1>Nave Lanzadera Imperial:<br>"+ lanzadera.toString()+"</h1>");
            out.print("<br>");
            out.println("<h1>Nave Supremacy:<br>"+ supremacy.toString()+"</h1>");
            out.print("<br>");
            out.println("<h1>Nave At-At:"+"<br>"+ atAt.toString()+"</h1>");
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
