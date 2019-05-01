/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelos.Email;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gusti
 */
@WebServlet(name = "Contact", urlPatterns = {"/Contact"})
public class Contact extends HttpServlet {
    
    private String host;
    private String port;
    private String user;
    private String pass;
    
    public void init() {
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Contact</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Contact at " + request.getContextPath() + "</h1>");
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
        HttpSession session=request.getSession();
        String content = "";
        String recipient = "gustifeli@hotmail.com";
        String subject = "Comentario Web: " + (request.getParameter("nombre") + " " + request.getParameter("apellido"));
        String inputMsj = request.getParameter("msj");
        String comentario = request.getParameter("comentario");
        String msj = "";
       // System.out.println("id campana: " +(String) session.getAttribute("idCampana"));
        //int idCampana = Integer.parseInt((String) session.getAttribute("idCampana"));
        String resultMessage = "";
        if (inputMsj == null) {
            content = "Nombre: " + (request.getParameter("nombre"))
                    + "\nApellido: " + (request.getParameter("apellido"))
                    + "\nEmail: " + (request.getParameter("email"))
                    + "\nTeléfono: " + (request.getParameter("telefono"))
                    + "\nLocalidad: " + (request.getParameter("localidad"))
                    + "\nMensaje: " + comentario;
            try {
                Email.sendEmail(host, port, user, pass, recipient, subject, content);
                //resultMessage = "El Mensaje se a enviado con éxito";
                resultMessage = "0";
            } catch (Exception e) {
                e.printStackTrace();
                //resultMessage = "Hubo un error: " + e.getMessage();
                resultMessage = "1";
            } finally {
                request.setAttribute("msg", resultMessage);
                getServletContext().getRequestDispatcher("/Contactos.jsp").forward(request, response);
//            //response.sendRedirect("Contactos.jsp");
            }
        } else {
            content = "Nombre: " + (request.getParameter("nombre"))
                    + "\nApellido: " + (request.getParameter("apellido"))
                    + "\nEmail: " + (request.getParameter("email"))
                    + "\nTeléfono: " + (request.getParameter("telefono"))
                    + "\nLocalidad: " + (request.getParameter("localidad"))
                    + "\nProducto: " + inputMsj
                    + "\nMensaje: " + comentario;
            try {
                Email.sendEmail(host, port, user, pass, recipient, subject, content);
                //resultMessage = "El Mensaje se a enviado con éxito";
                resultMessage = "0";
            } catch (Exception e) {
                e.printStackTrace();
                //resultMessage = "Hubo un error: " + e.getMessage();
                resultMessage = "1";
            } finally {
                request.setAttribute("msg", resultMessage);
//            getServletContext().getRequestDispatcher("/Contactos.jsp").forward(request, response);
//            //response.sendRedirect("Contactos.jsp");
//                if (idCampana == 1) {
//                    response.sendRedirect("ObtenerProductoInvierno");
//                }
            }
        }
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
