/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.Data;
import Modelos.Validador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author GustiFeli
 */
public class IniciarSesion extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet IniciarSesion</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet IniciarSesion at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
//        processRequest(request, response);
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        HttpSession r = request.getSession(true);
        String user = request.getParameter("name");
        String pass = request.getParameter("pass");
        Data d = new Data();
        Validador v = new Validador();
        System.out.println("User: " + user + "Pass: " + pass);

        if (user.isEmpty() || pass.isEmpty()) {
            r.setAttribute("error", "¡Hay campos vacios!");
            System.out.println("Hay campos vacios");
        } else {
            if (v.isUsernameOrPasswordValid(pass)) {
                try {
                    d.conectar();
                    if (d.userExistente(user)) {
                        if (d.cuentaExistente(user, pass)) {
                            r.setAttribute("sessionUser", user);
                            System.out.println("iniciando session");
                            response.sendRedirect("ListaProducto");
                            //request.getRequestDispatcher("ListaProducto").forward(request, response);
                        } else {
                            System.out.println("No coinciden");
                            r.setAttribute("error", "¡Ups, el usuario y contraseña no coinciden!");
                        }
                    } else {
                        System.out.println("No existe el usuario");
                        r.setAttribute("error", "¡El usuario ingresado no existe!");
                        //response.sendRedirect("Login.jsp");
                    }
                } catch (Exception e) {
                    System.out.println("Error servlet iniciarSesion: " + e);
                   // response.sendRedirect("Login.jsp");

                }
                d.desconectar();
            } else {
                r.setAttribute("error", "¡La contraseña no es vaslida!");
                //response.sendRedirect("Login.jsp");

            }
        }
        // response.sendRedirect("Login.jsp");
       // request.getRequestDispatcher("Login.jsp").forward(request, response);
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
