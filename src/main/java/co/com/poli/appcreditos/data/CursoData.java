/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class CursoData {
        
    private static List<Curso> listaCursos;
    
    static {        
        listaCursos = new ArrayList<Curso>(){
            {
                add(new Curso("10", "Java", 15D, 500000D, Boolean.TRUE));
                add(new Curso("20", "Node", 20D, 600000D, Boolean.TRUE));
            }
        };                
    }

    public static List<Curso> getListaCursos() {
        return listaCursos;
    }

    public static void setListaCursos(List<Curso> aListaCursos) {
        listaCursos = aListaCursos;
    }
    
    
}
