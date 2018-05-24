/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.appcreditos.business;

import co.com.poli.appcreditos.model.Usuario;
import java.util.List;

/**
 *
 * @author giovanny
 */
public interface IUsuarioBusiness {
    
    List<Usuario> obtenerListaUsuarios();
    Usuario obtenerUsuario(String documento);
    String crearUsuario(Usuario usuario);
    String modificarUsuario(Usuario usuario);
    String eliminarUsuario( String documento);
    Usuario obtenerUsuario(String email, String clave);
    
}
