/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.dao.implementation;

import co.com.poli.appcreditos.dao.ICursoDao;
import co.com.poli.appcreditos.data.CursoData;
import co.com.poli.appcreditos.model.Curso;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class CursoDaoImpl implements ICursoDao {

    @Override
    public List<Curso> obtenerListaCursos() {
        return CursoData.getListaCursos();
    }

    @Override
    public Curso obtenerCurso(String idCurso) {
        Curso curso = null;
        List<Curso> listaCursos = CursoData.getListaCursos();
        for (Curso cursoLista : listaCursos) {
            if (cursoLista.getIdCurso().equals(idCurso)) {
                curso = cursoLista;
            }
        }
        return curso;
    }

    @Override
    public String crearCurso(Curso curso) {
        List<Curso> listaCursos = CursoData.getListaCursos();
        listaCursos.add(curso);
        CursoData.setListaCursos(listaCursos);
        return "Curso Creado";
    }

    @Override
    public String modificarCurso(Curso curso) {
        List<Curso> listaCursos = CursoData.getListaCursos();
        listaCursos.set(listaCursos.indexOf(curso), curso);
        CursoData.setListaCursos(listaCursos);
        return "Curso Modificado";
    }

    @Override
    public String eliminarCurso(String idCurso) {
        List<Curso> listaCursos = CursoData.getListaCursos();
        listaCursos.remove(obtenerCurso(idCurso));
        CursoData.setListaCursos(listaCursos);
        return "Curso Eliminado";
    }

}
