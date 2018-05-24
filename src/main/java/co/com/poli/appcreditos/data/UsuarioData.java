/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.data;

import co.com.poli.appcreditos.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class UsuarioData {
   
    private static List<Usuario> listaUsuarios;
    
    static{
        
        listaUsuarios = new ArrayList<Usuario>(){
            {
                add(new Usuario("10", "Maria", "Garcia", "mariag@gmail.com" 
                                    , "12345", "ADMIN", Boolean.TRUE));
                add(new Usuario("20", "Jorge", "Medina", "jorgem@gmail.com" 
                                    , "12345", "CONSULTA", Boolean.TRUE));                
            }
        };
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> aListaUsuarios) {
        listaUsuarios = aListaUsuarios;
    }
    
    
}

