/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.controller;

import co.com.poli.appcreditos.business.implementation.CursoBusinessImpl;
import co.com.poli.appcreditos.business.implementation.UsuarioBusinessImpl;
import co.com.poli.appcreditos.model.Curso;
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
 * @author Usuario
 */
public class CursoServlet extends HttpServlet {

    String id;
    String nombre;
    Double hora;
    Double valor;

    Boolean estado;
    Curso curso;
    String mensaje = "";

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
        CursoBusinessImpl uBusinessImpl = new CursoBusinessImpl();
        String accion = request.getParameter("accion");
        String CodigoCurso = request.getParameter("txtid");

        List<Curso> listaCursos;

        switch (accion) {
            case "crear":
                id = request.getParameter("txtid");
                nombre = request.getParameter("txtcurso");
                hora = Double.valueOf(request.getParameter("txthoras"));
                valor = Double.valueOf(request.getParameter("txtvalor"));            
                estado = Boolean.valueOf(request.getParameter("txtestado"));
                curso = new Curso(id, nombre, hora, valor, estado);

                mensaje = uBusinessImpl.crearCurso(curso);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "eliminar":
                String msgDelete = uBusinessImpl.eliminarCurso(CodigoCurso);
                //System.out.println(msgDelete);
                rd = request.getRequestDispatcher("/view/cursoslista.jsp");
                break;
            case "actualizar":
                session.setAttribute("CodigoCurso", CodigoCurso);
                rd = request.getRequestDispatcher("/view/cursoEditar.jsp");

                break;
            case "save":
                id = request.getParameter("txtid");
                nombre = request.getParameter("txtcurso");
                hora = Double.valueOf(request.getParameter("txthoras"));
                valor = Double.valueOf(request.getParameter("txtvalor"));
                estado = Boolean.valueOf(request.getParameter("txtestado"));
                curso = new Curso(id, nombre, hora, valor, estado);
                mensaje = uBusinessImpl.modificarCurso(curso);
                listaCursos = uBusinessImpl.obtenerListaCursos();
                session.setAttribute("LISTADOCURSO", listaCursos);
                rd = request.getRequestDispatcher("/view/cursoslista.jsp");

                break;
            case "listar":
                listaCursos = uBusinessImpl.obtenerListaCursos();
                session.setAttribute("LISTADOCURSO", listaCursos);
                rd = request.getRequestDispatcher("/view/cursoslista.jsp");
                break;

            default:
                break;
        }
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
