/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.Data;
import Modelos.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GustiFeli
 */
public class ActualizarProducto extends HttpServlet {

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
            response.setContentType("text/html;charset+UTF-8");
                try {
            Producto p = new Producto();
            p.setIdproducto(Integer.parseInt(request.getParameter("idproducto")));
            p.setDescripcion(request.getParameter("descripcion"));
            p.setIdCampana(Integer.parseInt(request.getParameter("idCampana")));
            Data d = new Data();
            d.actualizarProducto(p);
//        MENSAJE CONFIRMACION
            PrintWriter out = response.getWriter();
//            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
            out.println("<script src='https://unpkg.com/sweetalert/dist/sweetalert.min.js'></script>");
            out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
            out.println("<script>");
            out.println("$(document).ready(function(){");
            out.println("swal({\n"
                    + "        title: '¡Perfecto!',\n"
                    + "        text: '!Su producto se actualizó con éxito!',\n"
                    + "        icon: 'success',\n"
                    + "        confirmButtonText: 'Ok',\n"
                    + "        closeOnConfirm: false,\n"
                    + "        html: true\n"
                    + "    });");
            out.println("});");
            out.println("</script>");
            RequestDispatcher rd = request.getRequestDispatcher("ListaProducto");
            rd.include(request, response);
        } catch (Exception e) {
            System.out.println("SERVLET ACTPRODUCTO ERROR: Error al actualizar el producto: " + e);
        }
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
