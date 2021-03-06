/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.controller;

import co.com.poli.appcreditos.business.implementation.UsuarioBusinessImpl;
import co.com.poli.appcreditos.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author giovanny
 */
public class UsuariosServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        UsuarioBusinessImpl uBusinessImpl = new UsuarioBusinessImpl();
        String accion = request.getParameter("accion");
         String documento = request.getParameter("txtdocumento");
        switch (accion) {
            case "crear":
                 documento = request.getParameter("txtdocumento");
                String nombres = request.getParameter("txtnombres");
                String apellidos = request.getParameter("txtapellidos");
                String tipotrabajador = request.getParameter("txttipotrabajador");
                String tipocredito = request.getParameter("txttipocredito");
                String trabajaenlacompania = request.getParameter("txttrabajacompania");
                Usuario usuario = new Usuario(documento, nombres, apellidos, tipotrabajador, tipocredito, trabajaenlacompania);

                String mensaje = uBusinessImpl.crearUsuario(usuario);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "listar":
                List<Usuario> listaUsuarios = uBusinessImpl.obtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuarios);
                rd = request.getRequestDispatcher("/view/usuarioslista.jsp");
                break;
            default:
                break;
        }
        //session.setAttribute("USUARIO", session.getAttribute("USUARIO"));
        rd.forward(request, response);

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
