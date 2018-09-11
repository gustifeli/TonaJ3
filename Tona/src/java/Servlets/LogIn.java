/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.Data;
import Controlador.DataUser;
import Modelos.Validador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gusti
 */
public class LogIn extends HttpServlet {

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
            out.println("<title>Servlet LogIn</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogIn at " + request.getContextPath() + "</h1>");
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

        String error = "No puede acceder, verifique los datos e intentelo nuevamente.";
        request.setAttribute("mensaje", error);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/error.jsp");
        dispatcher.forward(request, response);
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
        //processRequest(request, response);
        HttpSession r = request.getSession(true);
        String user = request.getParameter("name");
        String pass = request.getParameter("pass");
        Pattern p = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher m = p.matcher(user);
        Validador v = new Validador();
        DataUser d = new DataUser();

        //Campos vacios
        if (user.isEmpty() || pass.isEmpty()) {
            r.setAttribute("error", "Hay campos vacios");
        } else {
            //No hay campos vacios. 
            //si la direccion es valida
            if (m.find()) {
                r.setAttribute("error", "El usuario no es correcto");
            } else {
                //La direccion es correcta. Verificar si la contrseña es correcta
                if (v.isUsernameOrPasswordValid(pass)) {
                    try {
                        d.conectar();
                        if (d.cuentaExistente(user, pass)) {
                            //la cuenta existe. obtengo el nombre de usuario y lo guardo en la session
                            //String users = d.getName(user);
                            r.setAttribute("sessionUser", user);
                            response.sendRedirect("ListaProducto");
                        } else {
                            r.setAttribute("error", "Este usuario ya fue registrado");
                        }
                        d.desconectar();

                    } catch (Exception e) {
                        System.out.println("Error servlet LOGIN: " + e);
                    }
                } else {
                    r.setAttribute("error", "Contraseña no es válida");
                }
            }
//          request.getSession().setAttribute("nombreUsuario", user)
        }
        request.getSession().invalidate();
        response.sendRedirect("Login.jsp");
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
