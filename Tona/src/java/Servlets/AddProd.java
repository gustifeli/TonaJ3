/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.Data;
import Modelos.Producto;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author GustiFeli
 */
@WebServlet(name = "AddProd", urlPatterns = {"/AddProd"})
@MultipartConfig
public class AddProd extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddProd</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddProd at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        try {
            HttpSession r = request.getSession(true);
            Producto p = new Producto();
            int codcamp = Integer.parseInt(request.getParameter("idCampana"));
//            String  codOI = request.getParameter("otoñoInvierno");
            String txtimg = request.getParameter("descripcion");//obtiene la descripcion
            Part filepart = request.getPart("logo");//obtiene la imagen
            int fotoSize = (int) filepart.getSize();
//            byte[] foto = null;
//            if (fotoSize > 0) {
//                foto = new byte[fotoSize];
//                try (DataInputStream dis = new DataInputStream(filepart.getInputStream())) {
//                    dis.readFully(foto);
//                }
//            }

            InputStream inputStream = null;
            inputStream = filepart.getInputStream();

            p.setDescripcion(txtimg);
            p.setIdCampana(codcamp);
            System.out.println("Codigo campana: " + codcamp);
            if (fotoSize > 0) {
                p.setInputStreamFoto(inputStream);
            }
            Data d = new Data();
            d.AddProduct(p);
            request.getSession().setAttribute("msj", "¡El producto se agrego correctamente!");
            //response.sendRedirect("AddProduct.jsp");
            RequestDispatcher rd = request.getRequestDispatcher("obtenerCampana");
            rd.include(request, response);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            RequestDispatcher rd = request.getRequestDispatcher("AddProduct.jsp");
            rd.forward(request, response);
        }

        //obtiene el input text
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
