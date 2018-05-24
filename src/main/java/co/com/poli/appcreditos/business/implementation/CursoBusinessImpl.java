/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business.implementation;

import co.com.poli.appcreditos.business.ICursoBusiness;
import co.com.poli.appcreditos.dao.implementation.CursoDaoImpl;
import co.com.poli.appcreditos.model.Curso;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class CursoBusinessImpl implements ICursoBusiness {

    private CursoDaoImpl cursoDaoImpl = new CursoDaoImpl();

    @Override
    public List<Curso> obtenerListaCursos() {
        return cursoDaoImpl.obtenerListaCursos();
    }

    @Override
    public Curso obtenerCurso(String idCurso) {
        return cursoDaoImpl.obtenerCurso(idCurso);
    }

    @Override
    public String crearCurso(Curso curso) {
        String respuesta = "Curso ya existe";
        Curso cursoNuevo = obtenerCurso(curso.getIdCurso());
        if (cursoNuevo == null) {
            respuesta = cursoDaoImpl.crearCurso(curso);
        }
        return respuesta;
    }

    @Override
    public String modificarCurso(Curso curso) {
        String respuesta = "Curso no existe";
        Curso cursoNuevo = obtenerCurso(curso.getIdCurso());
        if (cursoNuevo != null) {
            respuesta = cursoDaoImpl.modificarCurso(curso);
        }
        return respuesta;
    }

    @Override
    public String eliminarCurso(String idCurso) {
        String respuesta = "Curso no existe";
        Curso cursoNuevo = obtenerCurso(idCurso);
        if (cursoNuevo != null) {
            respuesta = cursoDaoImpl.eliminarCurso(idCurso);
        }
        return respuesta;
    }

}
